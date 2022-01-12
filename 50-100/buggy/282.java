public void transportDataReceived(okio.Buffer frame, boolean endOfStream) {
    synchronized(lock) {
        long length = frame.size();
        window -= length;
        if ((window) < 0) {
            frameWriter.rstStream(id(), ErrorCode.FLOW_CONTROL_ERROR);
            io.grpc.Status status = Status.INTERNAL.withDescription("Received data size exceeded our receiving window size");
            if (transport.finishStream(id(), status)) {
                transport.stopIfNecessary();
            }
            return ;
        }
        super.transportDataReceived(new io.grpc.transport.okhttp.OkHttpReadableBuffer(frame), endOfStream);
    }
}
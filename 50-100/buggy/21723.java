private void interruptibleRun() throws java.lang.InterruptedException {
    try {
        while (true) {
            final int available = in.available();
            final int bytesRead = in.read(buffer, 0, buffer.length);
            if (bytesRead == (-1)) {
                break;
            }
            out.write(buffer, 0, bytesRead);
            out.flush();
        } 
    } catch (java.io.IOException e) {
        ch.racic.caps.utils.StreamCopyThread.logger.error("IOException during transfer from input to output stream", e);
        shutdown();
    }
}
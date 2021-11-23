@java.lang.Override
protected void processPipeTermAck() {
    assert (sink) != null;
    sink.pipeTerminated(this);
    if ((state) == (zmq.Pipe.State.TERMINATED)) {
        outpipe = null;
        sendPipeTermAck(peer);
    }else {
        assert ((state) == (zmq.Pipe.State.TERMINATING)) || ((state) == (zmq.Pipe.State.DOUBLE_TERMINATED));
    }
    if ((inpipe) == null) {
        return ;
    }
    while ((inpipe.read()) != null) {
    } 
    inpipe = null;
}
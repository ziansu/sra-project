public java.lang.Boolean isReadyToStreamFile() throws java.lang.Exception {
    isReadyToStreamFileEvent();
    if ((this.commOpen) == false) {
        throw new java.lang.Exception("Cannot begin streaming, comm port is not open.");
    }
    if ((!(this.awaitingResponseQueue.isEmpty())) || (!(this.outgoingQueue.isEmpty()))) {
        throw new java.lang.Exception("Cannot stream while there are active commands (controller).");
    }
    if (this.comm.areActiveCommands()) {
        throw new java.lang.Exception("Cannot stream while there are active commands (communicator).");
    }
    return true;
}
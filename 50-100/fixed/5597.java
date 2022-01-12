private void executeLine3(Model.ThreadContext currentContext) {
    Model.ThreadContext newContext = null;
    Model.ThreadContext oldContext = this.getCurrentContext();
    int nextStackPointer = 2;
    boolean bufferIsEmpty = (this.bufferOfItems.getBufferSize()) == 0;
    if (!bufferIsEmpty) {
        nextStackPointer = 3;
        newContext = new Model.ThreadContext(nextStackPointer, oldContext.getProducedItem(), Consts.STATUS_THREAD_EXECUTING, this);
    }else {
        newContext = new Model.ThreadContext(nextStackPointer, oldContext.getProducedItem(), Consts.STATUS_THREAD_EXECUTING, this);
    }
    this.currentContext = newContext;
}
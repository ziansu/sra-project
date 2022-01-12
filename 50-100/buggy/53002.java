public void emitControl(com.datatorrent.api.CustomControlTuple tuple) {
    if (((operatorThread) != null) && ((java.lang.Thread.currentThread()) != (operatorThread))) {
        throw new java.lang.IllegalStateException(((("Current thread " + (java.lang.Thread.currentThread().getName())) + " is different from the operator thread ") + (operatorThread.getName())));
    }
    if (propogateControl()) {
        sink.put(tuple);
    }
}
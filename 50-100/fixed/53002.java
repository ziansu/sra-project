public void emitControl(java.lang.Object tuple) {
    if (((operatorThread) != null) && ((java.lang.Thread.currentThread()) != (operatorThread))) {
        throw new java.lang.IllegalStateException(((("Current thread " + (java.lang.Thread.currentThread().getName())) + " is different from the operator thread ") + (operatorThread.getName())));
    }
    sink.put(new com.datatorrent.api.CustomControlTuple(tuple));
}
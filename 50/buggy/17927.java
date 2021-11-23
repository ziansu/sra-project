public int getLocalVariableIndex() {
    if ((localVariableIndex) == (com.h3xstream.findsecbugs.taintanalysis.Taint.INVALID_INDEX)) {
        throw new java.lang.IllegalStateException("index not set or has been invalidated");
    }
    return localVariableIndex;
}
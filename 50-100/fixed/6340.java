@java.lang.Override
protected void runInternal() throws com.github.blahord.integral.ComponentException {
    acquireLock(outputLock);
    if ((parseException) != null) {
        throw new com.github.blahord.integral.ComponentException("Error while parsing document", parseException);
    }
    if ((dataRowToOutput) == (com.github.blahord.integral.data.DataRow.EOI)) {
        finishProcessing();
    }else {
        addToOutput(outputName, dataRowToOutput);
    }
    dataRowToOutput = null;
    readLock.release();
}
public void printErrorOutputs(java.util.function.Consumer<java.lang.String> out) {
    if ((errorLog.size()) > (MAX_ERRORS))
        errorLog = errorLog.subList(0, 9);
    
    errorLog.forEach(out::accept);
}
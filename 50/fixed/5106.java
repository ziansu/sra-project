private boolean isFunction(java.lang.String functionName, java.lang.String text) {
    return (memcmp(functionName, text)) == (functionName.length());
}
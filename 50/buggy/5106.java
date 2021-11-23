private boolean isFunction(java.lang.String text, java.lang.String functionName) {
    return (memcmp(functionName, text)) == (functionName.length());
}
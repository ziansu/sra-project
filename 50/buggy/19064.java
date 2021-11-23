public com.rollbar.payload.data.body.Frame args(java.lang.Object[] args) {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, context, args, keywordArgs);
}
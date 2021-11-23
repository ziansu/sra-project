public com.rollbar.payload.data.body.Frame className(java.lang.String className) {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, className, context, args, keywordArgs);
}
public com.rollbar.payload.data.body.Frame context(com.rollbar.payload.data.body.CodeContext context) {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, context, args, keywordArgs);
}
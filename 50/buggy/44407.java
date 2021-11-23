public com.rollbar.payload.data.body.Frame filename(java.lang.String filename) throws com.rollbar.utilities.ArgumentNullException {
    return new com.rollbar.payload.data.body.Frame(filename, lineNumber, columnNumber, method, code, context, args, keywordArgs);
}
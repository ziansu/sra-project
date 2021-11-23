public java.lang.Object init(org.apache.velocity.context.InternalContextAdapter context, java.lang.Object data) throws org.apache.velocity.exception.TemplateInitException {
    super.init(context, data);
    java.lang.String str = getFirstToken().image;
    try {
        value = java.lang.Integer.valueOf(str);
    } catch (java.lang.NumberFormatException E1) {
        try {
            value = java.lang.Long.valueOf(str);
        } catch (java.lang.NumberFormatException E2) {
            value = new java.math.BigInteger(str);
        }
    }
    cleanupParserAndTokens();
    return data;
}
public void resolveForwardReferences() throws org.exist.xquery.XPathException {
    while (!(forwardReferences.isEmpty())) {
        final org.exist.xquery.FunctionCall call = forwardReferences.pop();
        final org.exist.xquery.UserDefinedFunction func = call.getContext().resolveFunction(call.getQName(), call.getArgumentCount());
        if (func == null) {
            throw new org.exist.xquery.XPathException(call, ErrorCodes.XPST0017, ("Call to undeclared function: " + (call.getQName().getStringValue())));
        }else {
            call.resolveForwardReference(func);
        }
    } 
}
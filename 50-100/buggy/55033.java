private void wasFunctionDeclared(java.lang.String identifier, java.lang.String signature, int lineNumber) {
    com.um.mt.kyle.parser.BlockStackFrame blockFrame = stackFrames.peek();
    com.um.mt.kyle.parser.FunctionStackFrame func = null;
    func = blockFrame.getFunction(identifier);
    if ((func == null) || (!(func.getFunctionSignature().equals(signature)))) {
        errorLogger(lineNumber, TokenClass.TYPE, ((("Function '" + identifier) + signature) + "' was not defined"), false);
    }
}
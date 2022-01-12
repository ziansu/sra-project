private com.google.javascript.rhino.Node replaceCallNode(com.google.javascript.jscomp.JsMessage message, com.google.javascript.rhino.Node callNode) throws com.google.javascript.jscomp.MalformedException {
    checkNode(callNode, Token.CALL);
    com.google.javascript.rhino.Node getPropNode = callNode.getFirstChild();
    checkNode(getPropNode, Token.GETPROP);
    com.google.javascript.rhino.Node stringExprNode = getPropNode.getNext();
    com.google.javascript.jscomp.ReplaceMessages.checkStringExprNode(stringExprNode);
    com.google.javascript.rhino.Node objLitNode = stringExprNode.getNext();
    return com.google.javascript.jscomp.ReplaceMessages.constructStringExprNode(message.parts().iterator(), objLitNode, callNode);
}
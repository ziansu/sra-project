private org.w3c.dom.Node isMultiplicativeOp() {
    org.w3c.dom.Element parent = doc.createElement("MultiplicativeOp");
    if (isAMultiplicativeOp()) {
        java.lang.String sym = ((currentTokenType()) == (JParserSym.MULTIPLICATION)) ? "*" : (currentTokenType()) == (JParserSym.DIVISION) ? "/" : "and";
        parent.setTextContent(sym);
        (tokenIndex)++;
        parent.setAttribute("lineNumber", ((currentTokenLineNumber()) + ""));
        return parent;
    }
    (tokenIndex)++;
    return null;
}
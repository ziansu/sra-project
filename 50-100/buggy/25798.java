public void enterRule(crux.NonTerminal nonTerminal) {
    java.lang.String lineData = new java.lang.String();
    for (int i = 0; i < (parseTreeRecursionDepth); i++) {
        lineData += "  ";
    }
    lineData += nonTerminal.name();
    parseTreeBuffer.append((lineData + "\n"));
    (parseTreeRecursionDepth)++;
}
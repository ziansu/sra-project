public void makeFormat() {
    for (nez.lang.Production rule : grammar) {
        elementsStack[stackTop] = new nez.bx.FormatGenerator.Elements();
        makeProductionFormat(rule);
        java.lang.String nonterminalName = rule.getLocalName();
        int nonterminalId = convertNonterminalName(nonterminalName);
        nonterminalList[nonterminalId] = new nez.bx.FormatGenerator.Captured(elementsStack[stackTop], nonterminalName);
    }
}
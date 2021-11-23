public void makeFormat() {
    for (nez.lang.Production rule : grammar) {
        java.lang.String nonterminalName = rule.getLocalName();
        int nonterminalId = convertNonterminalName(nonterminalName);
        elementsStack[stackTop] = new nez.bx.FormatGenerator.Elements();
        makeProductionFormat(rule);
        nonterminalList[nonterminalId] = new nez.bx.FormatGenerator.Captured(elementsStack[stackTop], nonterminalName);
    }
}
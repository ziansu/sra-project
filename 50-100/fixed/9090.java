@java.lang.Override
public org.jvoicexml.xml.srgs.GrammarType identify(final org.jvoicexml.GrammarDocument grammar) {
    final org.jvoicexml.xml.srgs.GrammarType requestedType = grammar.getMediaType();
    if (requestedType.equals(HalefGrammarType.HALEF)) {
        return HalefGrammarType.HALEF;
    }
    if (grammar.getTextContent().startsWith("wfst\n")) {
        return HalefGrammarType.HALEF;
    }
    return null;
}
private final boolean isWordBreak(int textOffset) {
    if (!(org.nbp.b2g.ui.Endpoint.isWordBreak(getLineText().charAt(textOffset))))
        return false;
    
    java.lang.CharSequence brailleCharacters = getBrailleCharacters();
    int brailleOffset = getBrailleOffset(textOffset);
    if (brailleOffset == (brailleCharacters.length()))
        return true;
    
    return (brailleCharacters.charAt(brailleOffset)) == (org.nbp.common.Braille.UNICODE_ROW);
}
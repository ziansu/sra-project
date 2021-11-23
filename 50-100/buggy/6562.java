protected boolean find(java.lang.String findWhat, boolean matchCase, boolean wholeWord) {
    if ((findWhat == null) || (findWhat.isEmpty()))
        return false;
    
    if (updateMatcher) {
        matcher = createMatcher(findWhat, matchCase, wholeWord);
        updateMatcher = false;
    }
    boolean found = matcher.find();
    if (found) {
        textPane.setSelectionStart(matcher.start());
        textPane.setSelectionEnd(matcher.end());
    }
    return found;
}
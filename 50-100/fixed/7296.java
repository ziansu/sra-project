private boolean hasUnknownTokenAt(org.languagetool.AnalyzedTokenReadings[] tokens, int startPos, int endPos) {
    for (int i = startPos; i < endPos; i++) {
        org.languagetool.AnalyzedTokenReadings token = tokens[i];
        for (org.languagetool.AnalyzedToken analyzedToken : token.getReadings()) {
            if (analyzedToken.hasNoTag()) {
                return true;
            }
        }
    }
    return false;
}
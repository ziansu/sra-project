java.lang.String getLastSnippet() {
    java.lang.StringBuilder s = new java.lang.StringBuilder();
    for (int i = (snippetLoc) + 1; i < (com.cedarsoftware.util.io.FastPushbackReader.SNIPPET_LENGTH); i++) {
        if (appendChar(s, i)) {
            break;
        }
    }
    for (int i = 0; i <= (snippetLoc); i++) {
        if (appendChar(s, i)) {
            break;
        }
    }
    return s.toString();
}
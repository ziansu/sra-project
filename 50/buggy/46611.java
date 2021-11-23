@java.lang.Override
public void reportBlockComment(java.lang.String type, int startLineNo, int startColNo, int endLineNo, int endColNo) {
    reportCComment(startLineNo, startColNo, endLineNo, endColNo);
}
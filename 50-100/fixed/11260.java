private void checkLineIndent(int lineNum, com.puppycrawl.tools.checkstyle.checks.indentation.IndentLevel indentLevel) {
    final java.lang.String line = indentCheck.getLine((lineNum - 1));
    if (!(line.isEmpty())) {
        final int start = getLineStart(line);
        if (indentLevel.isGreaterThan(start)) {
            logChildError(lineNum, start, indentLevel);
        }
    }
}
private void addCurlyBracket() {
    final java.lang.String line = getLineText(getCurrentCaretLine());
    java.lang.String intentation = getIntentation(line);
    trimEnding();
    goToEndOfCurrentLine();
    insert(((((" {" + (EOL)) + (EOL)) + intentation) + "}"));
    goToNextLine();
    insert(intentation);
    goToEndOfCurrentLine();
}
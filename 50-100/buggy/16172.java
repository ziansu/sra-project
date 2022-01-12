private void addCurlyBracket() {
    final java.lang.String line = getLineText(getCurrentCaretLine());
    java.lang.String intentation = getIntentation(line);
    trimEnding();
    insert(((((" {" + (EOL)) + (EOL)) + intentation) + "}"));
    goToNextLine();
    insert(intentation);
    goToEndOfCurrentLine();
}
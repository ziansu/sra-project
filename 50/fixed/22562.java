private void extractDelimiter(char ch, int lineNumber) {
    java.lang.String alias = java.lang.Character.toString(ch);
    lexemeTable.add(new lexeme.StraightLexeme(alias, enterLexemeTable.get(alias), lineNumber));
}
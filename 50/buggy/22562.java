private void extractDelimiter(char ch, java.lang.Integer lineNumber) {
    java.lang.String alias = java.lang.Character.toString(ch);
    lexemeTable.add(new lexeme.StraightLexeme(alias, enterLexemeTable.get(alias), lineNumber));
}
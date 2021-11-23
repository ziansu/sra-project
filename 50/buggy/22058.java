private void updateLexeme(int c) {
    if (scanner.Dispatcher.isEOL(c)) {
        lexeme += '\\';
        lexeme += 'n';
    }else {
        lexeme += ((char) (c));
    }
}
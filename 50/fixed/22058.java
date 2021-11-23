private void updateLexeme(int c) {
    if (scanner.Dispatcher.isEOL(c)) {
    }else {
        lexeme += ((char) (c));
    }
}
private void advanceLexerSkippingWhitespaces() {
    do {
        advanceLexer();
    } while ((atToken(com.maddyhome.idea.vim.lang.parser.WHITESPACE)) && (!(builder.eof())) );
}
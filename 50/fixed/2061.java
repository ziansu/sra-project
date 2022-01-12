private void advanceUntilNewLine() {
    do {
        advanceLexer();
    } while ((!(atToken(com.maddyhome.idea.vim.lang.parser.NEW_LINE))) && (!(builder.eof())) );
}
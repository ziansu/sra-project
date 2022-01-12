private void parseBlockComment() {
    while (((token.kind) != (TokenKind.BLOCK_COMMENT_CLOSE)) && ((token.kind) != (TokenKind.EOT))) {
        token = scanner.scan();
    } 
    accept(TokenKind.BLOCK_COMMENT_CLOSE);
}
private ast.Type parseType() {
    if (accept(TokenClass.INT)) {
        nextToken();
        return ast.Type.INT;
    }else
        if (accept(TokenClass.CHAR)) {
            nextToken();
            return ast.Type.CHAR;
        }else
            if (accept(TokenClass.VOID)) {
                nextToken();
                return ast.Type.VOID;
            }else {
                error(TokenClass.INT, TokenClass.CHAR, TokenClass.VOID);
                return null;
            }
        
    
}
private void methodReturnType() {
    java.lang.System.out.println("methodReturnType");
    if (type())
        if ((Assignment2.Parser.lookahead.getTokenCode()) == (TokenCode.VOID)) {
            match(TokenCode.VOID);
        }
    
}
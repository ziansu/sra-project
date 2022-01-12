public void statement() throws java.lang.Exception {
    if (accept(Token.letToken)) {
        assignment();
    }else
        if (accept(Token.callToken)) {
            funcCall();
        }else
            if (accept(Token.ifToken)) {
                ifStatement();
            }else
                if (accept(Token.whileToken)) {
                    whileStatement();
                }else
                    if (accept(Token.returnToken)) {
                        returnStatement();
                    }else {
                        throw new java.lang.Exception("Statement is invalid");
                    }
                
            
        
    
}
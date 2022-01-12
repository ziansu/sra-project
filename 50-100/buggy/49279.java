public void stat() throws compiler.parser.MismatchedTokenException {
    if (speculateAssign()) {
    }else
        if (speculateComp()) {
        }else
            if (speculateWhileS()) {
            }else
                if (speculateIfS()) {
                }else {
                    throw new compiler.parser.MismatchedTokenException(((("Expecting a statment; Found " + (lookToken(1))) + " ") + (lookToken(2))));
                }
            
        
    
}
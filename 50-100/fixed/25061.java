private void readHeadOfDataObject(com.trivialis.java.jassimp.util.IPointer<java.lang.String> poName) {
    java.lang.String nameOrBrace = GetNextToken();
    if (!("{".equals(nameOrBrace))) {
        if (poName != null)
            poName.set(nameOrBrace);
        
        java.lang.String a = GetNextToken();
        if (!(a.equals("{")))
            ThrowException(("Opening brace expected:" + a));
        
    }
}
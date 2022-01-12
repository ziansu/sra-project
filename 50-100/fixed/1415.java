private void ParseDataObjectTemplate() {
    com.trivialis.java.jassimp.util.IPointer<java.lang.String> name = com.trivialis.java.jassimp.util.Pointer.valueOf("");
    readHeadOfDataObject(name);
    java.lang.String guid = GetNextToken();
    boolean running = true;
    while (running) {
        java.lang.String s = GetNextToken();
        if ("}".equals(s))
            break;
        
        if ((s.length()) == 0)
            ThrowException("Unexpected end of file reached while parsing template definition");
        
    } 
}
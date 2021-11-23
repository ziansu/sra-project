private void ParseDataObjectTemplate() {
    com.trivialis.java.jassimp.util.IPointer<java.lang.String> name = com.trivialis.java.jassimp.util.Pointer.valueOf("");
    readHeadOfDataObject(name);
    java.lang.System.out.println(name.get());
    java.lang.String guid = GetNextToken();
    java.lang.System.out.println(guid);
    boolean running = true;
    while (running) {
        java.lang.String s = GetNextToken();
        java.lang.System.out.println(("dat object template, next token: " + s));
        if (s == "}")
            break;
        
        if ((s.length()) == 0)
            ThrowException("Unexpected end of file reached while parsing template definition");
        
    } 
}
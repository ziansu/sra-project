java.lang.String readCodes() throws java.io.IOException {
    if (interactive)
        java.lang.System.out.print(">>> ");
    
    java.lang.String code = readLine();
    if (code == null)
        return null;
    else
        code += "\n";
    
    int paren = parenCount(code);
    while (paren > 0) {
        java.lang.String line = readLine();
        if (line == null)
            break;
        
        code += line + "\n";
        paren += parenCount(line);
    } 
    return code;
}
public java.util.Scanner openFile() {
    if ((lexer.Lexer.myFile) == null)
        return null;
    
    if (!(isValidExtension()))
        throw new lexer.LexerException("File extension is not valid (must end in \".mc\")", LexerException.Type.INVALID_FILE_EXTENSION);
    
    java.io.FileInputStream fstream;
    try {
        fstream = new java.io.FileInputStream(lexer.Lexer.myFile);
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
        return null;
    }
    java.util.Scanner in = new java.util.Scanner(fstream);
    return in;
}
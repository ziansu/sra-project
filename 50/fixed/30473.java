void skipToNextLine() throws com.sun.j3d.loaders.ParsingErrorException {
    while (((ttype) != (java.io.StreamTokenizer.TT_EOL)) && ((ttype) != (-1))) {
        getToken();
    } 
}
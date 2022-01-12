public java.lang.String getPath(java.lang.String input) throws Exceptions.ParserExceptions.FilePathInvalidException {
    java.lang.String[] tokens = Parser.divideTokens(input);
    boolean test = StorageParser.canWrite(tokens[2]);
    if (test == false) {
        throw new Exceptions.ParserExceptions.FilePathInvalidException();
    }else {
        return tokens[2];
    }
}
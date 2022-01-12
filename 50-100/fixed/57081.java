public java.lang.String readLine() {
    java.lang.String result = "";
    boolean newLineFound = false;
    char currentCharacter = ' ';
    while ((!(fileOfPolicies.endOfFile())) && (!newLineFound)) {
        currentCharacter = fileOfPolicies.readChar();
        if (currentCharacter == '\n') {
            newLineFound = true;
        }else {
            result += currentCharacter;
        }
    } 
    return result;
}
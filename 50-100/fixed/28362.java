private Scanner.Token scanNextTokenInFile() {
    Scanner.Token nextToken = null;
    int readValue = -1;
    while (nextToken == null) {
        char ch;
        if ((nextTokenChar) != (java.lang.Character.MIN_VALUE)) {
            ch = nextTokenChar;
            this.nextTokenChar = java.lang.Character.MIN_VALUE;
        }else {
            readValue = getNextCharValue();
            if (readValue == (-1)) {
                break;
            }
            ch = ((char) (readValue));
        }
        nextToken = scanTokenFromStart(ch);
    } 
    return nextToken;
}
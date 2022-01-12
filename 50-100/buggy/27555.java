private void addStringToken(char type) {
    boolean canEvaluate = true;
    currentToken = new compiler.Token(xpos, ypos, "", Type.STRING);
    (xpos)++;
    try {
        while (canEvaluate & ((this.line.charAt(xpos)) != type)) {
            addChar();
        } 
    } catch (java.lang.StringIndexOutOfBoundsException e) {
        addToken();
        return ;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    addToken();
}
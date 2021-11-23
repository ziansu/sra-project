public static void main(java.lang.String[] args) {
    com.company.GameController gc = new com.company.GameController();
    boolean finished = false;
    int i = 0;
    while (!finished) {
        gc.playerTurn(i);
        i++;
    } 
}
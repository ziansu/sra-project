public boolean checkGame(int[][] gameField) {
    int human = 1;
    int computer = 2;
    if (this.checkPlayer(gameField, human)) {
        java.lang.System.out.println("X player WIN");
        return true;
    }else
        if (this.checkPlayer(gameField, computer)) {
            java.lang.System.out.println("O player Win");
            return true;
        }else
            return false;
        
    
}
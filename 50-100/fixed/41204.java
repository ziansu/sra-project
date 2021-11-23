public boolean checkGame(int[][] gameField) {
    int human = 1;
    int computer = 2;
    if (this.checkPlayer(gameField, human)) {
        return true;
    }else
        if (this.checkPlayer(gameField, computer)) {
            return true;
        }else
            return false;
        
    
}
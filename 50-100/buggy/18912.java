public boolean canDropADiscFromTop(int col, int currentPlayer) {
    if ((col < 0) || (col >= (this.width))) {
        java.lang.System.out.println("Illegal column!");
        return false;
    }else
        if ((this.numOfDiscsInColumn[col]) == (this.height)) {
            java.lang.System.out.println("Column is already full. Cannot drop more disc in it.");
            return false;
        }else
            return true;
        
    
}
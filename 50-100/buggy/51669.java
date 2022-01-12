public boolean canRemoveADiscFromBottom(int col, int currentPlayer) {
    if ((col < 0) || (col >= (this.width))) {
        java.lang.System.out.println("Illegal column!");
        return false;
    }else
        if ((board[((height) - 1)][col]) != currentPlayer) {
            java.lang.System.out.println((("You don't have a checker in column " + col) + " to pop out!"));
            return false;
        }else
            return true;
        
    
}
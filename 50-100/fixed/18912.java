public boolean canDropADiscFromTop(int col, int currentPlayer) {
    if ((col < 0) || (col >= (this.width))) {
        return false;
    }else
        if ((this.numOfDiscsInColumn[col]) == (this.height)) {
            return false;
        }else
            return true;
        
    
}
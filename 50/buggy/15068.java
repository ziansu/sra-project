public void setStitchColor(int colorID, int row, int col) {
    if ((mStitchGrid) == null) {
        savePattern();
        return ;
    }
    mStitchGrid[row][col].setColorID(colorID);
}
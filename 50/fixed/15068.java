public void setStitchColor(int colorID, int row, int col) {
    if ((mStitchGrid[row][col]) == null) {
        return ;
    }
    mStitchGrid[row][col].setColorID(colorID);
}
private void drawFocusLine(int numberOfFrontChar) {
    int beginLineOfset = 2;
    for (int x = beginLineOfset; x < ((calculateItemLength()) + beginLineOfset); x++)
        GUI_Matrix_Helper.turnPixel(true, x, calculateYItemOfset());
    
}
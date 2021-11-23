public void CheckColUpper(MyPanel myPanelB, int ClickedInX, int ClickedInY) {
    java.awt.Color hasNumber = java.awt.Color.ORANGE;
    int newGridX = ClickedInX;
    int newGridY = ClickedInY;
    while (!(BombsAround(myPanelB, newGridX, newGridY))) {
        myPanelB.colorArray[newGridX][newGridY] = uncoveredCell;
        newGridY--;
        myPanelB.repaint();
    } 
    myPanelB.colorArray[newGridX][newGridY] = hasNumber;
}
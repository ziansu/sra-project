public void CheckRowLeft(MyPanel myPanelB, int ClickedInX, int ClickedInY) {
    java.awt.Color hasNumber = java.awt.Color.ORANGE;
    int newGridX = ClickedInX;
    int newGridY = ClickedInY;
    while (!(BombsAround(myPanelB, newGridX, newGridY))) {
        myPanelB.colorArray[newGridX][newGridY] = uncoveredCell;
        newGridX--;
        myPanelB.repaint();
    } 
    myPanelB.colorArray[newGridX][newGridY] = hasNumber;
}
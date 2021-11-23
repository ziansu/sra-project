public void CheckRowLeft(MyPanel myPanelB, int ClickedInX, int ClickedInY) {
    java.awt.Color hasNumber = java.awt.Color.ORANGE;
    int newGridX = ClickedInX;
    int newGridY = ClickedInY;
    while (newGridX > 1) {
        newGridX = newGridX - 1;
        if (!(BombsAround(myPanelB, newGridX, newGridY))) {
            myPanelB.colorArray[newGridX][newGridY] = uncoveredCell;
            myPanelB.repaint();
        }else {
            myPanelB.colorArray[newGridX][newGridY] = hasNumber;
            myPanelB.repaint();
            newGridX = 0;
        }
    } 
}
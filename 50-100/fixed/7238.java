public void GameOver(MyPanel myPanelB, int ClickedInX, int ClickedInY) {
    if (HasBomb(myPanelB, ClickedInX, ClickedInY)) {
        for (int posArray = 0; posArray < (posXBomb.length); posArray++) {
            myPanelB.colorArray[ClickedInX][ClickedInY] = bombs;
            myPanelB.colorArray[posXBomb[posArray]][posYBomb[posArray]] = bombs;
            myPanelB.repaint();
        }
    }
}
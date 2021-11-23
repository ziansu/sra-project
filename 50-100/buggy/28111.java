public boolean readyToDevelop() {
    for (int heightIndex = 0; heightIndex < (filmHeightInPixels); heightIndex++) {
        for (int widthIndex = 0; widthIndex < (filmWidthInPixels); widthIndex++) {
            if ((colorGrid[heightIndex][widthIndex]) == null) {
                return false;
            }
        }
    }
    return true;
}
private void showNeigbours() {
    showNeigbourText = !(showNeigbourText);
    if (showNeigbourText) {
        updateNeigbourText();
    }else {
        for (int i = 0; i < (bCellArray.length); i++) {
            for (int r = 0; r < (bCellArray[i].length); r++) {
                bCellArray[i][r].setText("");
            }
        }
    }
}
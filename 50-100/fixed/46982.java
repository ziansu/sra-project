private void setEnableButtons(boolean status) {
    for (int y = 0; y < 10; y++) {
        for (int x = 0; x < 10; x++) {
            buttonForTheMineSweeperFields[x][y].setEnabled(status);
        }
    }
}
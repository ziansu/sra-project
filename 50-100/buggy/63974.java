public void computeCharacteristicVector() {
    for (int i = 0; i < (hlavolam.rows); i++) {
        for (int j = 0; j < (hlavolam.cols); j++) {
            hlavolam.getLetters()[i][j].computeCharacteristics();
        }
    }
    return ;
}
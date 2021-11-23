public void computeCharacteristicVector() {
    if ((hlavolam) == null)
        return ;
    
    for (int i = 0; i < (hlavolam.rows); i++) {
        for (int j = 0; j < (hlavolam.cols); j++) {
            hlavolam.getLetters()[i][j].computeCharacteristics();
        }
    }
    return ;
}
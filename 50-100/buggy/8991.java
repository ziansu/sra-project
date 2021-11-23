private boolean checkIfAllTilesAreInPlace() {
    for (int i = 0; i < (currentField.length); i++) {
        for (int j = 0; j < (currentField[i].length); j++) {
            if (currentField[i][j][0].equals(solutionField[i][j][0]))
                return false;
            
        }
    }
    return true;
}
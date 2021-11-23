private void generateSingleMove(int chipPosition) {
    if ((GameField.getAmtChipsOnField(chipPosition)) == 3) {
        calculateThreeChipMove(chipPosition);
    }else
        if ((GameField.getAmtChipsOnField(chipPosition)) == 2) {
            calculateTwoChipMove(chipPosition);
        }else
            calculateOneChipMove(chipPosition);
        
    
}
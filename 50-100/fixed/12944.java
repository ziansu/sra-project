private void calculateLength() {
    if ((orientation) == (Sens.VERTICAL)) {
        length = ((end.getRow()) - (start.getRow())) + 1;
    }else
        if ((orientation) == (Sens.HORIZONTAL)) {
            length = ((end.getCol()) - (start.getCol())) + 1;
        }
    
}
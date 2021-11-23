public boolean shootAt(int row, int column) {
    int tempRow = getBowRow();
    int tempColumn = getBowColumn();
    if ((!(isSunk())) || (!(stworo01.EmptySea.class.isInstance(this)))) {
        if (isHorizontal()) {
            this.hit[(column - tempColumn)] = true;
            return true;
        }else {
            this.hit[(row - tempRow)] = true;
            return true;
        }
    }
    return false;
}
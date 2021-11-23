@java.lang.Override
public void move(int row, int column) {
    super.move(row, column);
    sethasMoved(true);
    if ((color) == true) {
        if ((row == 0) && ((this.row) == 0)) {
            promote(choosePromotion());
        }
    }
    if ((color) == false) {
        if ((row == 7) && ((this.row) == 7)) {
            promote(choosePromotion());
        }
    }
}
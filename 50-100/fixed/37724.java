@java.lang.Override
public void kill() {
    int curRow = this.getLocation().getRow();
    int curCol = this.getLocation().getCol();
    this.getLocation().getLocale().removePos(curRow, curCol);
}
@java.lang.Override
public void kill() {
    java.lang.System.out.println("CALLED");
    int curRow = this.getLocation().getRow();
    int curCol = this.getLocation().getCol();
    this.getLocation().getLocale().removePos(curRow, curCol);
    java.lang.System.out.println(this.getLocation().getLocale().getObject(curRow, curCol));
}
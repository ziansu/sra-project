@java.lang.Override
public void showNewDiskForMe(int column, int row) {
    this.setPlayer(0);
    playGround.playerDiskPlayedUpsideDown(column, row);
    java.lang.System.out.println(((("x-> " + column) + "   y-> ") + row));
}
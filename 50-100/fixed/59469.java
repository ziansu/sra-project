@java.lang.Override
public void setLocation(int x, int y) {
    if ((java.lang.Math.abs((y - (pos.y)))) == 2) {
        enPassant = true;
    }
    pos.x = x;
    pos.y = y;
    moved = true;
}
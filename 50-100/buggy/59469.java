@java.lang.Override
public void setLocation(int x, int y) {
    if ((java.lang.Math.abs((y - (pos.y)))) == 2) {
        enPassant = true;
        java.lang.System.out.println(("ENPASSANT ACTIVE: " + (this)));
    }
    pos.x = x;
    pos.y = y;
    moved = true;
}
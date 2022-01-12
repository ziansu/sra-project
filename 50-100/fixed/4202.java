@java.lang.Override
public java.lang.String toString() {
    char[] posStr = new char[]{ ((char) (((int) ('a')) + (x))) , ((char) (((int) ('1')) + (((Board.ROWS) - (y)) - 1))) };
    return new java.lang.String(posStr);
}
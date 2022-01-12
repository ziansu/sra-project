@java.lang.Override
public boolean boardContains(int x, int y) {
    return (((x > 0) && (y > 0)) && (x < (gridRows))) && (y < (gridCols));
}
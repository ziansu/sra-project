@java.lang.Override
public boolean canMoveTo(int x, int y) {
    boolean rv = false;
    if ((x < 0) || (y < 0)) {
        rv = false;
    }else
        if (((x < (width)) && (y < (length))) && (!(coordinates[x][y]))) {
            rv = true;
        }
    
    return rv;
}
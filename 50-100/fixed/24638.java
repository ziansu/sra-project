@java.lang.Override
public void asc(int col) {
    sortIndex = null;
    studio.kdb.K.KBaseVector v = null;
    if (col == 0) {
        v = x;
    }else {
        v = y;
    }
    sortIndex = v.gradeUp();
    sorted = 1;
    sortedByColumn = col;
}
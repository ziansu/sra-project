@java.lang.Override
public void desc(int col) {
    sortIndex = null;
    studio.kdb.K.KBaseVector v = null;
    if (col == 0) {
        v = x;
    }else {
        v = y;
    }
    sortIndex = v.gradeDown();
    sorted = -1;
    sortedByColumn = col;
}
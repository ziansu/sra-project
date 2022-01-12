public void append() {
    if (((masterRef) & 1) == 0) {
        return ;
    }
    for (int i = 0; i < (columnCount); i++) {
        if ((refs.getQuick(i)) < (masterRef)) {
            com.questdb.cairo.Unsafe.arrayGet(nullers, i).run();
        }
    }
    (transientRowCount)++;
    (masterRef)++;
}
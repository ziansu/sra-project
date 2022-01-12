public void append() {
    if (((masterRef) & 1) == 0) {
        return ;
    }
    for (int i = 0; i < (columnCount); i++) {
        if ((refs.getQuick(i)) < (masterRef)) {
            nullers.getQuick(i).run();
        }
    }
    (transientRowCount)++;
    (masterRef)++;
}
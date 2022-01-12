public void simplify() {
    for (java.util.Iterator<java.lang.Integer> iter1 = ignoreRowsIterator(); iter1.hasNext();) {
        int rowIndex1 = iter1.next();
        for (java.util.Iterator<java.lang.Integer> iter2 = ignoreRowsIterator(); iter2.hasNext();) {
            int rowIndex2 = iter2.next();
            if ((rowIndex1 != rowIndex2) && (isSecondRowRedundant(rowIndex1, rowIndex2))) {
                addIgnoredRows(rowIndex2);
            }
        }
    }
}
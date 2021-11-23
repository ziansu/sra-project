public void removeNonModifiableColumn(java.lang.Integer... columnIndexes) {
    for (int column : columnIndexes) {
        this.nonModifiableColumns.remove(column);
    }
}
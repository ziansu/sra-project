private void sort() {
    if ((this.sorter) != null) {
        java.util.Collections.sort(backingAppInfoList, this.sorter);
    }
}
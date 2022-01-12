private int lookUpEntry(java.lang.String s) {
    for (int i = 0; i < (this.numOfEntries); i++) {
        if (this.gameEntries[i].getName().equals(s)) {
            return i;
        }
    }
    return -1;
}
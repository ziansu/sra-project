protected void addChange(int start1, int start2, int end1, int end2) {
    com.intellij.util.diff.Diff.Change change = new com.intellij.util.diff.Diff.Change(start1, start2, (end1 - start1), (end2 - start2), null);
    if ((myLastChange) != null) {
        myLastChange.link = change;
    }else {
        myFirstChange = change;
    }
    myLastChange = change;
    myIndex1 = end1;
    myIndex2 = end2;
}
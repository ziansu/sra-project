@java.lang.Override
public int compare(java.lang.Object o1, java.lang.Object o2) {
    long o1QID = jenkins.widgets.HistoryPageEntry.getEntryId(o1);
    long o2QID = jenkins.widgets.HistoryPageEntry.getEntryId(o2);
    if (o1QID < o2QID) {
        return 1;
    }else
        if (o1QID == o2QID) {
            return 0;
        }else {
            return -1;
        }
    
}
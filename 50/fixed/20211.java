@java.lang.Override
public int compareTo(de.blau.android.util.IndexSearchResult arg0) {
    if ((arg0.count) > (count)) {
        return -1;
    }else
        if ((arg0.count) < (count)) {
            return +1;
        }
    
    return 0;
}
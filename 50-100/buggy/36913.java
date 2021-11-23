@java.lang.Override
public int compare(pl.mobilization.mobilizationcheckin.User u1, pl.mobilization.mobilizationcheckin.User u2) {
    int compareLast = pl.mobilization.mobilizationcheckin.MyAdapter.POLISH_COLLATOR.compare(u1.getLast(), u2.getLast());
    if (compareLast != 0)
        return compareLast;
    
    int compareFirst = pl.mobilization.mobilizationcheckin.MyAdapter.POLISH_COLLATOR.compare(u1.getFirst(), u2.getLast());
    if (compareFirst != 0)
        return compareFirst;
    
    return u1.getNumber().compareTo(u2.getNumber());
}
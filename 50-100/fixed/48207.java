@java.lang.Override
@java.lang.SuppressWarnings(value = "unchecked")
public int compare(java.lang.Comparable o1, java.lang.Comparable o2) {
    if (o1 == (herddb.index.blink.BLinkInner.EverBiggerKey.INSTANCE)) {
        if (o2 == (herddb.index.blink.BLinkInner.EverBiggerKey.INSTANCE)) {
            return 0;
        }
        return +1;
    }else
        if (o2 == (herddb.index.blink.BLinkInner.EverBiggerKey.INSTANCE)) {
            return -1;
        }else {
            return o1.compareTo(o2);
        }
    
}
@java.lang.Override
public int compare(java.lang.String object1, java.lang.String object2) {
    java.lang.Long l1 = mp.get(object1);
    java.lang.Long l2 = mp.get(object2);
    if (l2 == null) {
        l2 = 0L;
    }
    if (l1 == null) {
        l1 = 0L;
    }
    return l1 < l2 ? 1 : l1 == l2 ? 0 : -1;
}
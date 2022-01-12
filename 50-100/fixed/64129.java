@java.lang.Override
public int compare(java.lang.Object o1, java.lang.Object o2) {
    int diff = 0;
    if ((kind) != null) {
        diff = (diffCounter.getDiffCount(o1, kind)) - (diffCounter.getDiffCount(o2, kind));
    }else {
        diff = (diffCounter.getDiffCount(o1)) - (diffCounter.getDiffCount(o2));
    }
    return diff;
}
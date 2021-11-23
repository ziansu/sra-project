@java.lang.Override
public int compare(java.util.Calendar o1, java.util.Calendar o2) {
    java.lang.Long diff1 = (now.getTimeInMillis()) - (o1.getTimeInMillis());
    java.lang.Long diff2 = (now.getTimeInMillis()) - (o2.getTimeInMillis());
    return diff1.compareTo(diff2);
}
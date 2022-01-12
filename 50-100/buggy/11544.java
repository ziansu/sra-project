@java.lang.Override
public int compare(android.location.Location t1, android.location.Location t2) {
    if ((t1.getTime()) > (t2.getTime())) {
        return 1;
    }
    if ((t2.getTime()) > (t1.getTime())) {
        return -1;
    }
    return 0;
}
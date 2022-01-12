@java.lang.Override
public int compare(com.backend.facer.Face o1, com.backend.facer.Face o2) {
    java.lang.String q1 = (o1 == null) ? null : o1.getQuality();
    java.lang.String q2 = (o2 == null) ? null : o2.getQuality();
    if (q1 == q2) {
        return 0;
    }
    if (q1 == null) {
        return -1;
    }
    if (q2 == null) {
        return 1;
    }
    return q1.compareTo(q2);
}
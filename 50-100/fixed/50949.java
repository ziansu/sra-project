public int compare(java.lang.Object o1, java.lang.Object o2) {
    if ((o1 == nullValue) && (o2 == nullValue)) {
        return 0;
    }
    if (o1 == nullValue) {
        return 1;
    }
    if (o2 == nullValue) {
        return -1;
    }
    return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
}
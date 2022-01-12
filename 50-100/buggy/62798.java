public int compare(java.util.Calendar o1, java.util.Calendar o2) {
    java.lang.Long diff1 = new java.lang.Long(((now.getTimeInMillis()) - (o1.getTimeInMillis())));
    java.lang.Long diff2 = new java.lang.Long(((now.getTimeInMillis()) - (o2.getTimeInMillis())));
    return diff1.compareTo(diff2);
}
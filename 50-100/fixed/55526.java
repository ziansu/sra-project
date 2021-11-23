public com.erbis.java.courses.algorithms.sort.SortStat sort(int[] array) {
    com.erbis.java.courses.algorithms.sort.SortStat sortStat = new com.erbis.java.courses.algorithms.sort.SortStat(array.length);
    long startTime = java.lang.System.currentTimeMillis();
    sort(array, sortStat);
    sortStat.setTime(((java.lang.System.currentTimeMillis()) - startTime));
    return sortStat;
}
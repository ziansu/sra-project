public static <T extends java.lang.Comparable<? super T>> boolean isBetweenDateTime(T lt, T startTime, T endTime) {
    return ((startTime.compareTo(lt)) >= 0) && ((lt.compareTo(endTime)) >= 0);
}
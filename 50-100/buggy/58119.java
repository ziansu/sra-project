private static <T> java.lang.String toString(T first, T... others) {
    java.util.List<T> resultList;
    if (others == null) {
        resultList = new java.util.ArrayList<T>(2);
        resultList.add(null);
    }else {
        resultList = new java.util.ArrayList<T>(((others.length) + 1));
        java.util.Collections.addAll(resultList, others);
    }
    resultList.add(first);
    return resultList.toString();
}
public java.util.List<java.lang.Double> prodOfLists(java.util.List<java.lang.Double> xList, java.util.List<java.lang.Double> yList) {
    java.util.List<java.lang.Double> resList = new java.util.ArrayList<java.lang.Double>();
    int size = xList.size();
    for (int i = 0; i < size; i++) {
        resList.set(i, ((xList.get(i)) * (yList.get(i))));
    }
    return resList;
}
private void initGroupSizeArray(java.util.TreeMap<java.lang.Object, java.lang.Long> groupSize2groupFrequency, int minGroupSize) {
    groupSizeList.clear();
    for (java.lang.Object obj : groupSize2groupFrequency.keySet()) {
        int grpSize = java.lang.Integer.valueOf(obj.toString());
        if (grpSize >= minGroupSize) {
            groupSizeList.add(grpSize);
        }
    }
    groupSizeList.sort(new java.util.Comparator<java.lang.Integer>() {
        @java.lang.Override
        public int compare(java.lang.Integer o1, java.lang.Integer o2) {
            return o1 - o2;
        }
    });
}
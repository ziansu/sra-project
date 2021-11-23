private static int getRecord(java.util.List<java.lang.Integer> records, double t) {
    int index = SIRModel.getTimeIndex(t);
    try {
        int count = records.get(index);
        return count;
    } catch (java.lang.Exception e) {
        return -1;
    }
}
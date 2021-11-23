private static double getRecord(java.util.List<java.lang.Double> records, double t) {
    int index = SIRModel.getTimeIndex(t);
    try {
        double count = records.get(index);
        return count;
    } catch (java.lang.Exception e) {
        return -1.0;
    }
}
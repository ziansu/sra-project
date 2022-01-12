private java.util.Map<java.lang.String, java.lang.Double> lineToVector(final java.lang.String line) {
    final java.util.Map<java.lang.String, java.lang.Double> vector = new java.util.HashMap<java.lang.String, java.lang.Double>();
    final java.lang.String vectorData = line.split(">", 2)[1];
    for (java.lang.String dataPoint : vectorData.split("\t")) {
        final java.lang.String[] data = dataPoint.split(" ");
        vector.put(data[0], java.lang.Double.parseDouble(data[1]));
    }
    return vector;
}
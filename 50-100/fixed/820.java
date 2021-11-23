private program3.kmeans.Kmeans.Record scale(program3.kmeans.Kmeans.Record u, double k) {
    double[] result = new double[u.attributes.length];
    for (int i = 0; i < (u.attributes.length); i++) {
        result[i] = k * (u.attributes[i]);
    }
    return new program3.kmeans.Kmeans.Record(result);
}
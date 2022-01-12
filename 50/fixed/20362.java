public void train(pl.edu.pw.eiti.randomforest.Data data, java.lang.String target, double P, java.util.Map<java.lang.String, java.util.Set<java.lang.String>> values) {
    root = buildTree(data, target, P, data.getColumnNames(), values);
}
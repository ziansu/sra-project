public void train(pl.edu.pw.eiti.randomforest.Data data, java.lang.String target, double P) {
    root = buildTree(data, target, P, data.getColumnNames());
}
public static int normalizeAll(java.util.List<java.util.List<java.lang.String>> dataTrain, java.util.List<java.util.List<java.lang.String>> dataTest) {
    int nbAttr = dataTrain.get(0).size();
    for (int attr = 0; attr < nbAttr; attr++) {
        Preprocess.normalize(dataTrain, dataTest, attr);
    }
    return 1;
}
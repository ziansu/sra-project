private static double getMainEntropy() {
    int size = controllers.classification.ID3.data.size();
    java.util.ArrayList<java.lang.Double> probabilityList = new java.util.ArrayList();
    double frequency = 0;
    for (java.lang.String classInfo : controllers.classification.ID3.classes) {
        frequency = java.util.Collections.frequency(controllers.classification.ID3.classes, classInfo);
        probabilityList.add((frequency / size));
    }
    return controllers.classification.ID3.entropy(probabilityList);
}
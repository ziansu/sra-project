protected weka.classifiers.Classifier getClassifier() {
    if ((classifier) == null) {
        assignClassifier();
    }
    return classifier;
}
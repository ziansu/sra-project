protected weka.classifiers.Classifier getClassifier() {
    if ((this.classifier) == null) {
        assignClassifier();
    }
    return this.classifier;
}
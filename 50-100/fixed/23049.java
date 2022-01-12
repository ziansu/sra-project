public double computeTrainingError() {
    int numberOfMisclassifiedRecords = 0;
    for (DecisionTreeClassifier.Record currentRecord : records) {
        java.lang.String labelOfClassifiedRecord = classify(currentRecord);
        if ((currentRecord.label.equals(labelOfClassifiedRecord)) == false) {
            numberOfMisclassifiedRecords++;
        }
    }
    return ((double) (numberOfMisclassifiedRecords)) / (records.size());
}
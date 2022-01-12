public double computeTrainingError() {
    int numberOfMisclassifiedRecords = 0;
    for (DecisionTreeClassifier.Record currentRecord : records) {
        java.lang.String labelOfClassifiedRecord = classify(currentRecord);
        java.lang.System.out.println(currentRecord.label);
        java.lang.System.out.println(labelOfClassifiedRecord);
        java.lang.System.out.println();
        if ((currentRecord.label.equals(labelOfClassifiedRecord)) == false) {
            numberOfMisclassifiedRecords++;
        }
    }
    return ((double) (numberOfMisclassifiedRecords)) / (records.size());
}
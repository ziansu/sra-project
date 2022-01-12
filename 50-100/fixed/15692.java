public static void main(java.lang.String[] args) throws java.io.IOException, java.text.ParseException {
    java.lang.String inputFile = "./fn_rice.txt";
    mains.CRFMain.loadData(inputFile);
    Classifier.supervised.ALogisticRegression alr = new Classifier.supervised.ALogisticRegression(mains.CRFMain.numClass, mains.CRFMain.numFeature, 1.0);
    mains.CRFMain.crossValidation(alr, 10);
}
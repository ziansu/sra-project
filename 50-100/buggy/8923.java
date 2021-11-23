private static weka.core.Instances loadTestFile(java.lang.String fileName) {
    weka.core.Instances data = null;
    weka.core.converters.ArffLoader loader = new weka.core.converters.ArffLoader();
    try {
        loader.setFile(new java.io.File(fileName));
        data = loader.getDataSet();
        data.setClassIndex(((data.numAttributes()) - 1));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return data;
}
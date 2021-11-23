private static weka.core.Instances loadTestFile(java.io.File file) {
    weka.core.Instances data = null;
    weka.core.converters.ArffLoader loader = new weka.core.converters.ArffLoader();
    try {
        loader.setFile(file);
        data = loader.getDataSet();
        data.setClassIndex(((data.numAttributes()) - 1));
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return data;
}
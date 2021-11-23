public int executePredictionClassIndex(java.lang.String filePath) throws java.lang.Exception {
    weka.core.converters.ConverterUtils.DataSource ds = new weka.core.converters.ConverterUtils.DataSource(filePath);
    weka.core.Instances dataset = ds.getDataSet();
    dataset.setClassIndex(((dataset.numAttributes()) - 1));
    if ((dataset.numInstances()) != 1) {
        throw new net.floodlightcontroller.prediction.Exception.NotCorrespondingInstanceNumberException();
    }
    double classPred = classifier.classifyInstance(dataset.instance(0));
    return ((int) (classPred));
}
public static weka.core.Instances getAarfData(java.lang.String FileName) throws java.io.IOException {
    weka.core.converters.ArffLoader loader = new weka.core.converters.ArffLoader();
    loader.setFile(new java.io.File(FileName));
    weka.core.Instances data = loader.getDataSet();
    data.setClassIndex(((data.numAttributes()) - 1));
    java.lang.System.out.println(data);
    return data;
}
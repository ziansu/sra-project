public static void main(java.lang.String[] args) throws java.lang.Exception {
    MyID3 ID3 = new MyID3();
    MyC45 C45;
    MainClass.j48 = new weka.classifiers.trees.J48();
    weka.classifiers.Classifier cls = ID3;
    MainClass.preprocessFile("weather.nominal.arff");
    MainClass.crossValidation(cls, 10);
}
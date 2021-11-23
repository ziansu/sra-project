@java.lang.Override
public void buildClassifier(weka.core.Instances data) throws java.lang.Exception {
    iData = data;
    makeNeuralNetwork();
}
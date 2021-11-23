@java.lang.Override
public void buildClassifier(weka.core.Instances i) throws java.lang.Exception {
    iData = i;
    makeNeuralNetwork();
}
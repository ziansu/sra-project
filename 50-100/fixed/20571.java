public double[] classify(float[][] data) {
    double[] output = new double[data.length];
    for (int i = 0; i < (data.length); ++i) {
        output[i] = 0;
    }
    for (javaboost.weaklearning.WeakClassifier wc : m_classifiers) {
        output = javaboost.util.Utils.addVectors(output, wc.classify(data));
    }
    return output;
}
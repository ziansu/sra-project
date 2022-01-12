@java.lang.Override
public double calculateError(org.encog.ml.data.MLDataSet data) {
    if ((getOutputMode()) == (PNNOutputMode.Classification)) {
        return org.encog.util.simple.EncogUtility.calculateClassificationError(this, data);
    }else {
        return org.encog.util.simple.EncogUtility.calculateRegressionError(this, data);
    }
}
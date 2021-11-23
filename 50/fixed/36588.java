@org.junit.Test
public void testSi() {
    org.deeplearning4j.nn.weights.WeightInitUtil.initWeights(1, 2, WeightInit.VI, org.nd4j.linalg.factory.Nd4j.getDistributions().createNormal(0, 1));
}
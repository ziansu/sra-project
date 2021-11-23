protected org.nd4j.linalg.api.ndarray.INDArray createBeta(org.deeplearning4j.nn.conf.NeuralNetConfiguration conf) {
    org.deeplearning4j.nn.conf.layers.BatchNormalization layer = ((org.deeplearning4j.nn.conf.layers.BatchNormalization) (conf.getLayer()));
    org.nd4j.linalg.api.ndarray.INDArray ret = org.nd4j.linalg.factory.Nd4j.valueArrayOf(layer.getNOut(), layer.getBeta());
    ret.data().persist();
    return ret;
}
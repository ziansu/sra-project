private double getNewScore(org.nd4j.linalg.api.ndarray.INDArray parameters) {
    layer.setParams(parameters);
    return layer.score();
}
protected org.nd4j.linalg.api.ndarray.INDArray createScalarForIndex(int i, boolean applyOffset) {
    return org.nd4j.linalg.factory.Nd4j.create(data(), new int[]{ 1 , 1 }, new int[]{ 1 , 1 }, (applyOffset ? (offset) + i : i));
}
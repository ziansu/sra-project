protected org.nd4j.linalg.api.ndarray.INDArray createScalarForIndex(int i, boolean applyOffset) {
    return create(data(), new int[]{ 1 , 1 }, new int[]{ 1 , 1 }, (applyOffset ? (offset) + i : i));
}
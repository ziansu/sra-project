public org.nd4j.linalg.api.ndarray.INDArray getMatrix(int offset, int size) {
    org.nd4j.linalg.api.ndarray.INDArray res = new org.nd4j.linalg.cpu.NDArray(size, HIDDEN_LAYER_SIZE);
    for (int i = 0; i < size; i++) {
        res.putRow(i, w_h.getRow((offset + i)));
    }
    return res;
}
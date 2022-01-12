public void initDepNN(java.lang.String modelDir, double posThres, double negThres) throws java.io.IOException {
    if ((depnn) != null) {
        depnn = new uk.ac.cam.cl.depnn.nn.NeuralNetwork<uk.ac.cam.cl.depnn.io.Dependency>(modelDir, new uk.ac.cam.cl.depnn.io.Dependency());
    }
    this.nnPosThres = posThres;
    this.nnNegThres = negThres;
}
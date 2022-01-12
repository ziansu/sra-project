private static Matrix[] initW(int nHLayers, int[] widthLayer) {
    Matrix[] layerWeights = new Matrix[nHLayers];
    for (int i = 0; i < nHLayers; i++) {
        layerWeights[i] = Matrix.random(widthLayer[(i + 1)], ((widthLayer[i]) + 1));
    }
    return layerWeights;
}
private static Matrix[] initW(int nHLayers, int[] widthLayer) {
    Matrix[] layerWeights = new Matrix[nHLayers + 1];
    for (int i = 0; i < (nHLayers + 1); i++) {
        layerWeights[i] = Matrix.random(widthLayer[(i + 1)], ((widthLayer[i]) + 1));
    }
    return layerWeights;
}
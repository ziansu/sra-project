public models.RawModel loadToVAO(float[] positions, float[] textureCoords, int[] indices) {
    int vaoID = createVAO();
    bindIndicesBuffer(indices);
    storeDataInAttributeList(0, 3, positions);
    storeDataInAttributeList(1, 2, textureCoords);
    unbindVAO();
    return new models.RawModel(vaoID, indices.length);
}
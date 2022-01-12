public ModelBuildComponents.RawModel loadToVAO(float[] positions, int dimensions) {
    int vaoID = createVAO();
    this.storeDataAttributeList(0, dimensions, positions);
    unbindVAO();
    return new ModelBuildComponents.RawModel(vaoID, ((positions.length) / dimensions));
}
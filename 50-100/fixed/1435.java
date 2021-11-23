public void loadModel(java.lang.String modelFile) throws java.lang.Exception {
    if (!(new java.io.File(modelFile).exists())) {
        throw new java.lang.Exception("Model file doesn't exist!");
    }
    if (!(fta.checkModel(modelFile))) {
        throw new java.lang.Exception("Model file's format is not compatible with this JFastText version!");
    }
    fta.loadModel(modelFile);
}
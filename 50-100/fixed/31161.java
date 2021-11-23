private java.lang.String tryToSetCurrentModel(java.lang.String modelName) {
    java.io.File modelFile = getModelFile(modelName);
    if (modelFile != null) {
        setCurrentModel(modelFile.getName());
        return ("Current model is now '" + (getCurrentModel())) + "'";
    }
    return null;
}
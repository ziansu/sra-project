private void setSparseData(java.io.File file, int fileTarget) throws java.io.IOException {
    if (fileTarget == (controllers.managers.ClassificationManager.SET_TRAINING_DATA)) {
        this.trainingData = net.sf.javaml.tools.data.FileHandler.loadSparseDataset(file, 0, " ", ":");
    }else
        if (fileTarget == (controllers.managers.ClassificationManager.SET_CLASSIFICATION_DATA)) {
            this.classificationData = net.sf.javaml.tools.data.FileHandler.loadSparseDataset(file, 0, " ", ":");
            java.lang.System.out.println(this.classificationData.size());
        }
    
    file.delete();
}
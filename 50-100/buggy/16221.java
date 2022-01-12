public void newPerceptronToTrain() throws java.io.IOException, java.lang.ClassNotFoundException {
    if (originalFile.exists()) {
        originalFile.delete();
    }
    if (trainedFile.exists()) {
        trainedFile.delete();
    }
    encogInterface.createPerceptron(originalFile, false);
}
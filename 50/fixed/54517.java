public void run(java.lang.String trainfile, java.lang.String trainoutfile, boolean labelled) {
    java.lang.String trainfilename = trainfile;
    java.lang.String trainoutfilename = trainoutfile;
    readFileContent(trainfilename);
    createFeatureMap(labelled);
    writeFeatures(trainoutfilename, "train", labelled);
}
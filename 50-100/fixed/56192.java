public void trainer(java.lang.String dataConfigFileName, java.lang.String corpusConfigFileName) throws java.io.IOException {
    data.GNTdataProperties dataProps = new data.GNTdataProperties(dataConfigFileName);
    corpus.GNTcorpusProperties corpusProps = new corpus.GNTcorpusProperties(corpusConfigFileName);
    trainer.GNTrainer gnTrainer = new trainer.GNTrainer(dataProps, corpusProps);
    dataProps.copyConfigFile(dataConfigFileName);
    gnTrainer.gntTrainingWithDimensionFromConllFile(corpusProps.getTrainingFile(), corpusProps.getClusterIdNameFile(), dataProps.getGlobalParams().getDim(), dataProps.getGlobalParams().getNumberOfSentences());
}
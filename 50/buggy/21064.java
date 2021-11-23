public void setData(dictionary.DataContainer dataContainer) {
    studyStrategy = dataContainer.studyStrategy;
    cardIndexesFromChoose = dataContainer.auxiliaryDataContainer.studiedCardIndexes;
    answerDataByStudyItemsContainer = dataContainer.auxiliaryDataContainer.studiedAnswerDataByStudyItemContainer;
}
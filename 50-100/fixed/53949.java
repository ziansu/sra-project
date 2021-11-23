public void calculateProbabilityOfUnseenWords(dissertation.UnigramModel unigram) {
    this.probabilityOfUnseenWord = this.frequencyOfFrequencyCounts.get(1);
    this.probabilityOfUnseenWord = (this.probabilityOfUnseenWord) / (unigram.getTotalWordCount());
    this.probabilityOfUnseenWord = (this.probabilityOfUnseenWord) / (this.numberOfCommonlyUsedWordsInEnglish);
}
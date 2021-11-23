public void calculateProbabilityOfUnseenWords(dissertation.UnigramModel unigram) {
    java.lang.System.out.println(this.frequencyOfFrequencyCounts.get(1));
    this.probabilityOfUnseenWord = this.frequencyOfFrequencyCounts.get(1);
    this.probabilityOfUnseenWord = (this.probabilityOfUnseenWord) / (unigram.getTotalWordCount());
    this.probabilityOfUnseenWord = (this.probabilityOfUnseenWord) / (this.numberOfCommonlyUsedWordsInEnglish);
    java.lang.System.out.println(("Prob of unseen words is " + (probabilityOfUnseenWord)));
}
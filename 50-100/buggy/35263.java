public static void trainMapCalcLidstonUnigram(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> lidstoneTrainMap, long trainingMapSize) {
    for (java.lang.String word : lidstoneTrainMap.keySet()) {
        InputOutput.DataClass.trainMapLidstonUnigram.put(word, InputOutput.LidstoneModel.CalcUnigramPLidstone(BackOff.UNIGRAM_LAMDA, lidstoneTrainMap, trainingMapSize, word));
    }
    InputOutput.DataClass.trainMapLidstonUnigram.put(InputOutput.DataClass.UNSEEN_WORD, InputOutput.LidstoneModel.CalcUnigramPLidstone(BackOff.UNIGRAM_LAMDA, lidstoneTrainMap, trainingMapSize, InputOutput.DataClass.UNSEEN_WORD));
    InputOutput.DataClass.trainMapLidstonUnigram.remove(InputOutput.DataClass.FirstArticleWord);
}
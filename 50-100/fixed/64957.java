@java.lang.Override
public void addOOVRules(int sourceWord, java.util.List<org.apache.joshua.decoder.ff.FeatureFunction> featureFunctions) {
    int targetWord = (config.mark_oovs) ? org.apache.joshua.corpus.Vocabulary.id(((org.apache.joshua.corpus.Vocabulary.word(sourceWord)) + "_OOV")) : sourceWord;
    int nt_i = org.apache.joshua.corpus.Vocabulary.id("[X]");
    org.apache.joshua.decoder.ff.tm.Rule oovRule = new org.apache.joshua.decoder.ff.tm.Rule(nt_i, new int[]{ nt_i , sourceWord }, new int[]{ -1 , targetWord }, "", 1);
    addRule(oovRule);
    oovRule.estimateRuleCost(featureFunctions);
}
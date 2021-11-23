@org.junit.Test
public void identifyAllInterrogativeWord() throws java.lang.Exception {
    for (net.taken.bernard.analysis.attribute.InterrogativeWord word : net.taken.bernard.analysis.attribute.InterrogativeWord.values()) {
        net.taken.bernard.common.Sentence sentence = new net.taken.bernard.common.Sentence(((word.toString()) + " fjebnrfui gfeger ?"));
        java.lang.System.out.println(sentence.getSentenceString());
        assertEquals(word, net.taken.bernard.analysis.analyser.InterrogativeWordAnalyserTest.analyser.getInterrogativeWord(sentence));
    }
}
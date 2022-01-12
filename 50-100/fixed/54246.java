private static void testSynsets15Path() {
    WordNet wn = new WordNet(WordNet.getInputFilePath("synsets15.txt"), WordNet.getInputFilePath("hypernyms15Path.txt"));
    assert (wn.getDag().V()) == 15;
    assert (wn.getDag().E()) == 14;
    java.lang.System.out.println(wn.getDag());
}
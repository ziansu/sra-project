public static void loadModelFromBin() throws com.medallia.word2vec.Searcher.UnknownWordException, java.io.IOException, org.apache.thrift.TException {
    final com.medallia.word2vec.Word2VecModel model;
    try (com.medallia.word2vec.util.ProfilingTimer timer = com.medallia.word2vec.util.ProfilingTimer.create(fr.frazew.word2vec.Word2Vec.LOG, "Loading model")) {
        java.io.File file = new java.io.File("knowledge-vectors-skipgram1000.bin");
        model = com.medallia.word2vec.Word2VecModel.fromBinFile(file);
    }
    fr.frazew.word2vec.Word2Vec.interact(model, model.forSearch());
}
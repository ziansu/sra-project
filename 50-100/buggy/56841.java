public static void loadModel() throws com.medallia.word2vec.Searcher.UnknownWordException, java.io.IOException, org.apache.thrift.TException {
    final com.medallia.word2vec.Word2VecModel model;
    try (com.medallia.word2vec.util.ProfilingTimer timer = com.medallia.word2vec.util.ProfilingTimer.create(fr.frazew.word2vec.Word2Vec.LOG, "Loading model")) {
        java.lang.String json = com.medallia.word2vec.util.Common.readFileToString(new java.io.File("text8.model"));
        model = com.medallia.word2vec.Word2VecModel.fromThrift(com.medallia.word2vec.util.ThriftUtils.deserializeJson(new com.medallia.word2vec.thrift.Word2VecModelThrift(), json));
    }
    fr.frazew.word2vec.Word2Vec.interact(model, model.forSearch());
}
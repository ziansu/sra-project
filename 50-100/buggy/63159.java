public void execute(backtype.storm.tuple.Tuple tuple) {
    java.lang.String sentence = tuple.getStringByField("sentence");
    com.huaban.analysis.jieba.JiebaSegmenter jieba = new com.huaban.analysis.jieba.JiebaSegmenter();
    java.util.List<com.huaban.analysis.jieba.Word> list = jieba.sentenceProcess(sentence);
    for (com.huaban.analysis.jieba.Word word : list) {
        this.collector.emit(new backtype.storm.tuple.Values(word.getToken()));
    }
}
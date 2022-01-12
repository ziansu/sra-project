public void execute(backtype.storm.tuple.Tuple tuple) {
    java.lang.String sentence = tuple.getStringByField("sentence");
    com.huaban.analysis.jieba.JiebaSegmenter jieba = new com.huaban.analysis.jieba.JiebaSegmenter();
    java.util.List<java.lang.String> list = jieba.sentenceProcess(sentence);
    for (java.lang.String word : list) {
        this.collector.emit(new backtype.storm.tuple.Values(word));
    }
}
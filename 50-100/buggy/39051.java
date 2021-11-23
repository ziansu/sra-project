@java.lang.Override
public void execute(backtype.storm.tuple.Tuple tuple, backtype.storm.topology.BasicOutputCollector collector) {
    java.lang.String word = tuple.getString(0);
    java.lang.String normalizedWord = normalizeWord(word);
    if (!(commonWord(normalizedWord))) {
        collector.emit(new backtype.storm.tuple.Values(word));
    }
}
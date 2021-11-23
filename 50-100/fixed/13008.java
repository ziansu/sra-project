@java.lang.Override
public void execute(backtype.storm.tuple.Tuple tuple) {
    java.lang.String text = tuple.getValue(0).toString();
    java.lang.String language = "UNKNOWN";
    com.joelholder.bolt.LanguageIdentifier li = new com.joelholder.bolt.LanguageIdentifier(text);
    language = li.getLanguage();
    _collector.emit(new backtype.storm.tuple.Values(text, language));
    _collector.ack(tuple);
}
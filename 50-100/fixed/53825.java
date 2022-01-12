private void process(backtype.storm.tuple.Tuple input, java.util.List<java.lang.String> hashTags) {
    twitter4j.Status tweet = ((twitter4j.Status) (input.getValue(1)));
    for (java.lang.String tag : hashTags) {
        if (tweet.getText().toLowerCase().contains(tag)) {
            _collector.emit(new backtype.storm.tuple.Values(input.getValues()));
            return ;
        }
    }
}
@java.lang.Override
protected void map(org.apache.hadoop.hbase.io.ImmutableBytesWritable rowkey, org.apache.hadoop.hbase.client.Result value, com.studium.millionsong.mapreduce.Context context) throws java.io.IOException, java.lang.InterruptedException {
    java.lang.String name = new java.lang.String(value.getValue(com.studium.millionsong.mapreduce.CountSongsWithTopic.SongTopicMapper.CF_SONG, com.studium.millionsong.mapreduce.CountSongsWithTopic.SongTopicMapper.ATTR_NAME));
    java.lang.String title = new java.lang.String(value.getValue(com.studium.millionsong.mapreduce.CountSongsWithTopic.SongTopicMapper.CF_SONG, com.studium.millionsong.mapreduce.CountSongsWithTopic.SongTopicMapper.ATTR_TITLE));
    java.lang.CharSequence topic = "love";
    if (!(title.contains(topic)))
        return ;
    
    artist_name.set(name);
    context.write(artist_name, ONE);
}
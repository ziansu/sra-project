public void insertHashtag(java.lang.String hashtag, java.lang.Integer freq) {
    analysis.CassandraManager.session.execute(analysis.CassandraManager.bsInsertHashtag.bind(hashtag, freq));
}
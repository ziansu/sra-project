public void addGifURL(java.lang.String term, java.lang.String gifURL) {
    jedis.sadd(urlSetKey(term), gifURL);
}
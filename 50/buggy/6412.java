public void addHashTag(java.lang.String hashtag) {
    java.util.Set<java.lang.String> hashtags = getHashTags();
    hashtags.add(hashtag);
    setHashTags(hashtags);
}
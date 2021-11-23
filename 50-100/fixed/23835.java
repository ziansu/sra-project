private void addTopics(java.lang.String s) {
    s = s.replace(tools.DocumentParser.TAG_TOPICS_OPENED, "");
    s = s.replace(tools.DocumentParser.TAG_TOPICS_CLOSED, "");
    s = s.replace(tools.DocumentParser.TAG_ITEM_OPENED, "");
    java.lang.String[] topics = s.split(tools.DocumentParser.TAG_ITEM_CLOSED);
    currentArticle.setTopics(topics);
}
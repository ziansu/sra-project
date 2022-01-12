private boolean containImage(slmt.crawler.dcard.json.Post post) {
    java.lang.String article = post.content;
    return article.contains("imgur.com");
}
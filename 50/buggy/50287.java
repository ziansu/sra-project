private boolean containImage(slmt.crawler.dcard.json.Post post) {
    java.lang.String article = post.version.get(0).content;
    return article.contains("imgur.com");
}
public static java.util.List<java.lang.String> getImageUrls(slmt.crawler.dcard.json.Post post) {
    return slmt.crawler.dcard.analyzer.PostParser.getImageUrls(post.content);
}
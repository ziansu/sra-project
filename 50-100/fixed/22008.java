private gg.main.SinglePageConverter.Image extractImage(org.jsoup.nodes.Element element) {
    java.lang.String link = element.attr("abs:src");
    java.lang.String fileName = gg.utils.Utils.latinize(gg.utils.Utils.getLastPart(link, "/"));
    if ((link == null) || (link.isEmpty())) {
        return null;
    }
    java.lang.String path = getRelativePath();
    try {
        gg.utils.Utils.downloadImage(link, path, fileName);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return new gg.main.SinglePageConverter.Image(path, fileName);
}
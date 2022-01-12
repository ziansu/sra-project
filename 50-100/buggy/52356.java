static java.lang.String getTitle(org.jsoup.nodes.Element bdItem) {
    org.jsoup.nodes.Element bdTitle = bdItem.select("a").first();
    java.lang.String title = "No information";
    if (bdTitle != null) {
        title = bdTitle.text();
        play.Logger.debug((("FnacExtractData : getTitle :_____MCA___________________________ :" + "bdTitle : ") + (bdTitle.text())));
    }
    return title.trim();
}
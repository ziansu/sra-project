private java.lang.String filterTitleAndSubtitle(org.jsoup.nodes.Element element) {
    org.jsoup.nodes.Element elementToCheck = element.select(".name").first();
    return (elementToCheck.text()) + ".";
}
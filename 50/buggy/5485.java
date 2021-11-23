private boolean mangaFound(org.jsoup.nodes.Document document) {
    return document.getElementsByClass("mt10").first().text().equals("No Manga Series.");
}
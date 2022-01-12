private boolean mangaFound(org.jsoup.nodes.Document document) {
    if ((document.getElementsByClass("mt10").first()) == null)
        return false;
    
    return document.getElementsByClass("mt10").first().text().equals("No Manga Series.");
}
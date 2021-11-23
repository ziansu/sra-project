private static java.lang.Boolean urlExist(java.lang.String url) {
    try {
        org.jsoup.nodes.Document doc = org.jsoup.Jsoup.connect(url).timeout(((MangaDownloader.TimeOutInSec) * 1000)).get();
    } catch (java.net.UnknownHostException e) {
        return false;
    } catch (java.io.IOException ex) {
        ex.printStackTrace();
    }
    return true;
}
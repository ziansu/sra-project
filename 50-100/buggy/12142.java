private java.util.ArrayList<java.net.URL> mapToAbsolute(org.jsoup.select.Elements anchors) {
    java.util.ArrayList<java.net.URL> res = new java.util.ArrayList<>();
    for (org.jsoup.nodes.Element a : anchors) {
        java.net.URL u = com.codeforsanjose.blic.Crawler.parseUrl(a.attr("abs:href"));
        if ((u != null) && (!(pages.containsKey(u)))) {
            res.add(u);
        }
    }
    return res;
}
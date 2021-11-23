@org.springframework.web.bind.annotation.RequestMapping(value = "/cs480/jsoupHyperLinks", method = org.springframework.web.bind.annotation.RequestMethod.GET)
java.util.ArrayList<java.lang.String> parseHyperlinks(java.lang.String url) {
    org.jsoup.nodes.Document doc;
    java.util.ArrayList<java.lang.String> storedLinks = new java.util.ArrayList<java.lang.String>();
    try {
        doc = org.jsoup.Jsoup.connect(url).get();
        org.jsoup.select.Elements links = doc.select("a[href]");
        for (org.jsoup.nodes.Element link : links) {
            storedLinks.add(link.attr("href"));
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return storedLinks;
}
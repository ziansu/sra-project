@org.springframework.web.bind.annotation.RequestMapping(value = "/cs480/jsoupHyperLinks", method = org.springframework.web.bind.annotation.RequestMethod.GET)
java.util.List<java.lang.String> parseHyperlinks(java.lang.String url) {
    org.jsoup.nodes.Document doc;
    try {
        doc = org.jsoup.Jsoup.connect(url).get();
        org.jsoup.select.Elements links = doc.select("a[href]");
        java.util.List<java.lang.String> storedLinks = new java.util.List<java.lang.String>();
        for (org.jsoup.nodes.Element link : links) {
            storedLinks.add(link.attr("href"));
        }
    } catch (edu.csupomona.cs480.controller.IOException e) {
        e.printStackTrace();
    }
}
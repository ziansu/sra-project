public static void doCrawler(org.jsoup.select.Elements URLsOnAPage) {
    for (org.jsoup.nodes.Element newlink : URLsOnAPage) {
        java.lang.String linkHref = newlink.attr("href");
        java.lang.String linkText = newlink.text();
        if ((linkHref.length()) > 0) {
            java.lang.System.out.println(((("标题：" + linkText) + "\n\u94fe\u63a5\uff1a") + linkHref));
            Crawler4BD.eachurl.add(linkHref);
        }
    }
}
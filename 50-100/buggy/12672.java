private void addShowLink(java.lang.String url, java.util.List<net.myonlinestuff.torrentdl.domain.ShowLink> showLinks, org.jsoup.select.Elements el) {
    if ((el != null) && (!(el.isEmpty()))) {
        net.myonlinestuff.torrentdl.service.Parser.LOGGER.info("element found: {}", el.toString());
        for (final org.jsoup.nodes.Element element : el) {
            showLinks.add(new net.myonlinestuff.torrentdl.domain.ShowLink(element.text(), element.attr("href"), url));
        }
    }
}
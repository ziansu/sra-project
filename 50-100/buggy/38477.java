public void addWebpage(net.microtrash.Webpage page) {
    parsedWebPages.put(page.getUrl(), page);
    log(((("added webpage " + (page.getUrl())) + " to DB... total: ") + (parsedWebPages.size())));
}
public static java.util.List<models.CityBus> getAllBusLines() throws java.io.IOException {
    java.util.List<com.gargoylesoftware.htmlunit.html.HtmlElement> elements = crawler.implementation.JSPBusCrawler.getAllLines();
    java.util.List<com.gargoylesoftware.htmlunit.html.HtmlPage> returnList = new java.util.ArrayList<com.gargoylesoftware.htmlunit.html.HtmlPage>();
    for (int i = 0; i < (elements.size()); i++) {
        com.gargoylesoftware.htmlunit.html.HtmlPage page = elements.get(i).click();
        returnList.add(page);
    }
    return crawler.implementation.JSPBusParser.parseCityBuses(returnList);
}
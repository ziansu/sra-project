private <T> java.util.List<T> processTable(java.lang.String url, org.pub.pt.data.sources.anacom.Anacom.LineProcessor<T> processor) throws java.lang.Exception {
    java.util.List<T> tarifas = new java.util.ArrayList<>();
    org.jsoup.Connection con = org.pub.global.utils.DomUtils.get(url);
    org.jsoup.nodes.Document doc = con.get();
    org.jsoup.select.Elements lines = doc.getElementsByTag("tbody").get(0).getElementsByTag("tr");
    for (org.jsoup.nodes.Element line : lines) {
        tarifas.add(processor.processLine(line));
    }
    return tarifas;
}
public void parseDocument() {
    org.jsoup.nodes.Document d = org.jsoup.Jsoup.parse(html);
    java.lang.String text = d.body().text();
    java.lang.String[] tokens = text.split(" ");
    for (java.lang.String t : tokens) {
        addToInvertedIndex(t);
    }
    pushInvertedIndex();
}
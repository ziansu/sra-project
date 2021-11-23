private static java.lang.String getClassification(org.jsoup.nodes.Document doc) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc);
    java.lang.String text = doc.getElementsByClass("dextable").first().child(0).child(3).child(0).text();
    return io.github.endreman0.pokedex.io.WebIO.logger.exit(text.substring(0, text.lastIndexOf(' ')));
}
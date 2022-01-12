private static void getClassification(org.jsoup.nodes.Document doc, io.github.endreman0.javajson.nodes.ObjectNode data) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc, data);
    java.lang.String text = doc.getElementsByClass("dextable").first().child(0).child(3).child(0).text();
    data.put("classification", string(text.substring(0, text.lastIndexOf(' '))));
    io.github.endreman0.pokedex.io.WebIO.logger.exit();
}
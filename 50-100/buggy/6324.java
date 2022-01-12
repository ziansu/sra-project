private static void getHappiness(org.jsoup.nodes.Document doc, io.github.endreman0.javajson.nodes.ObjectNode data) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc, data);
    data.put("happiness", num(java.lang.Integer.parseInt(doc.getElementsByClass("dextable").get(1).child(0).child(3).child(1).text())));
    io.github.endreman0.pokedex.io.WebIO.logger.exit();
}
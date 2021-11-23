private static void getEggSteps(org.jsoup.nodes.Document doc, io.github.endreman0.javajson.nodes.ObjectNode data) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc, data);
    data.put("eggSteps", num(java.lang.Integer.parseInt(doc.getElementsByClass("dextable").first().child(0).child(3).child(4).text().replace(",", ""))));
    io.github.endreman0.pokedex.io.WebIO.logger.exit();
}
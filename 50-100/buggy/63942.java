private static void getSkyBattle(org.jsoup.nodes.Document doc, io.github.endreman0.javajson.nodes.ObjectNode data) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc, data);
    data.put("skyBattle", bool(doc.getElementsByClass("dextable").get(1).child(0).child(3).child(3).text().trim().equals("Eligible")));
    io.github.endreman0.pokedex.io.WebIO.logger.exit();
}
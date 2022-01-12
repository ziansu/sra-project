private static void getName(org.jsoup.nodes.Document doc, io.github.endreman0.javajson.nodes.ObjectNode data) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc, data);
    java.lang.String title = doc.getElementsByTag("title").first().html();
    data.put("name", string(title.substring(0, title.indexOf(" - "))));
    io.github.endreman0.pokedex.io.WebIO.logger.exit();
}
private static int getHappiness(org.jsoup.nodes.Document doc) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc);
    return io.github.endreman0.pokedex.io.WebIO.logger.exit(java.lang.Integer.parseInt(doc.getElementsByClass("dextable").get(1).child(0).child(3).child(1).text()));
}
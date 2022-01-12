private static int getEggSteps(org.jsoup.nodes.Document doc) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc);
    return io.github.endreman0.pokedex.io.WebIO.logger.exit(java.lang.Integer.parseInt(doc.getElementsByClass("dextable").first().child(0).child(3).child(4).text().replace(",", "")));
}
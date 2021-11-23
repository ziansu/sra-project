private static boolean getSkyBattle(org.jsoup.nodes.Document doc) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc);
    return io.github.endreman0.pokedex.io.WebIO.logger.exit(doc.getElementsByClass("dextable").get(1).child(0).child(3).child(3).text().trim().equals("Eligible"));
}
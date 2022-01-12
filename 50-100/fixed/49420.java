private static java.lang.String getName(org.jsoup.nodes.Document doc) {
    io.github.endreman0.pokedex.io.WebIO.logger.entry(doc);
    java.lang.String title = doc.getElementsByTag("title").first().html();
    return io.github.endreman0.pokedex.io.WebIO.logger.exit(title.substring(0, title.indexOf(" - ")));
}
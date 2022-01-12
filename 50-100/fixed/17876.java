static java.nio.file.Path bulletinPath(com.github.onsdigital.generator.ContentNode productNode, com.github.onsdigital.content.page.statistics.document.bulletin.Bulletin bulletin) {
    java.nio.file.Path path = com.github.onsdigital.generator.ContentGenerator.contentsDirectory.resolve(productNode.path()).resolve("bulletins");
    java.util.Date date = new java.util.Date();
    if ((bulletin.getDescription().getReleaseDate()) != null) {
        date = bulletin.getDescription().getReleaseDate();
    }
    java.text.SimpleDateFormat format = new java.text.SimpleDateFormat("yyyy-MM-dd");
    java.lang.String text = format.format(date);
    return path.resolve(text);
}
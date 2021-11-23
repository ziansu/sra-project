public static net.dv8tion.jda.core.entities.MessageEmbed embedImage(java.lang.String title, java.lang.String url, java.awt.Color color) {
    net.dv8tion.jda.core.EmbedBuilder eb = new net.dv8tion.jda.core.EmbedBuilder();
    if (title != null) {
        eb.setAuthor(title, null, null);
    }
    if (!(url.endsWith(".png"))) {
        url = url + ".png";
    }
    eb.setImage(url);
    eb.setColor(color);
    eb = com.tisawesomeness.minecord.util.MessageUtils.addFooter(eb);
    return eb.build();
}
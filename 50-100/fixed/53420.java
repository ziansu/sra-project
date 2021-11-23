private java.lang.String format(java.lang.String message, java.lang.String player, java.lang.Integer amount, com.vexsoftware.votifier.model.Vote site) {
    return message.replace('&', '§').replace("§§", "&").replace("{player}", player).replace("{amount}", amount.toString()).replace("{site}", site.getServiceName());
}
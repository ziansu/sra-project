public void broadcast(cn.nukkit.Player player) {
    java.lang.String translation = cn.nukkit.Server.getInstance().getLanguage().translateString("chat.type.achievement", player.getDisplayName(), ((cn.nukkit.utils.TextFormat.GREEN) + (this.getMessage())));
    if (cn.nukkit.Server.getInstance().getPropertyBoolean("announce-player-achievements", true)) {
        cn.nukkit.Server.getInstance().broadcastMessage(translation);
    }else {
        player.sendMessage(translation);
    }
}
public static boolean isMinner(cn.nukkit.command.CommandSender player) {
    if (player.isPlayer()) {
        mineless.Main.Minner.contains(((cn.nukkit.Player) (player)));
        return true;
    }
    return false;
}
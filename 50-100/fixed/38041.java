public static void opListInit() {
    for (org.bukkit.entity.Player player : cloud.swiftnode.ksecurity.util.Static.getOnlinePlayers()) {
        if (!(cloud.swiftnode.ksecurity.util.Config.getOpList().contains(player.getName()))) {
            player.setOp(false);
        }
    }
}
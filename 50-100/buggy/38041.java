public static void opListInit() {
    StaticStorage.ALLOWED_OP_SET.clear();
    StaticStorage.ALLOWED_OP_SET.addAll(cloud.swiftnode.ksecurity.util.Config.getOpList());
    for (org.bukkit.entity.Player player : cloud.swiftnode.ksecurity.util.Static.getOnlinePlayers()) {
        if (!(StaticStorage.ALLOWED_OP_SET.contains(player.getName()))) {
            player.setOp(false);
        }
    }
}
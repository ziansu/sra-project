public static boolean canUseName(org.bukkit.entity.Player player, java.lang.String name) {
    java.lang.String shortenedName = com.Acrobot.Breeze.Utils.NameUtil.stripUsername(com.Acrobot.ChestShop.UUIDs.NameManager.getUsername(player.getUniqueId()));
    if (com.Acrobot.ChestShop.Signs.ChestShopSign.isAdminShop(name)) {
        return false;
    }
    return ((shortenedName.equals(name)) || (com.Acrobot.ChestShop.Permission.otherName(player, name))) || (player.getUniqueId().equals(com.Acrobot.ChestShop.UUIDs.NameManager.getUUID(name)));
}
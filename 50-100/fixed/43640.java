public static int subtractCrate(org.bukkit.entity.Player player, theweekend.playerdata.CrateType crateType) {
    int index = crateType.getIndex();
    int total = (theweekend.playerdata.PlayerData.getCrates(player, index)) - 1;
    theweekend.playerdata.PlayerData.setCrates(player, index, total);
    return total;
}
private void addWarp(org.bukkit.command.CommandSender sender, java.util.UUID owner, net.acomputerdog.bigwarps.warp.Warp warp) {
    if (((warps.getPrivateWarps(owner).getNumTotalWarps()) < (plugin.maxWarpsTotal)) || (sender.hasPermission("bigwarps.ignoreprivatelimit"))) {
        warps.addWarp(warp);
        sendAqua("Warp created.");
    }else {
        sendRed("You have too many private warps.");
    }
}
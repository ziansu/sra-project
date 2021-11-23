public void launchCrateForPlayer(java.lang.String crateType, org.spongepowered.api.entity.living.player.Player target, pw.codehusky.huskycrates.HuskyCrates plugin) {
    crateType = crateType.toLowerCase();
    if (!(crateTypes.containsKey(crateType))) {
        java.lang.System.out.println(crateType);
        target.openInventory(new pw.codehusky.huskycrates.crate.views.NullCrateView(plugin, target, null).getInventory(), plugin.genericCause);
    }else {
        target.openInventory(crateTypes.get(crateType).generateViewForCrate(plugin, target).getInventory(), plugin.genericCause);
    }
}
private static void resetCrateStation(theweekend.cosmetics.crates.CrateStation crateStation) {
    crateStation.setHologramVisible(true);
    crateStation.setPlayer(null);
    crateStation.setCrateType(null);
    crateStation.setBypass(false);
    if (crateStation.isOpening()) {
        org.bukkit.Bukkit.getScheduler().cancelTask(crateStation.getTask());
        crateStation.setOpening(false);
        crateStation.setItemDisplay(null);
    }
    crateStation.reset();
}
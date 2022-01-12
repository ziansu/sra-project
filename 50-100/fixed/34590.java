public int getMaxLand() {
    int landPerPlayer = P.p.getConfig().getInt("hcf.land-per-player", 5);
    int maxFactionLand = P.p.getConfig().getInt("hcf.faction-land-max", 40);
    return java.lang.Math.min(((fplayers.size()) * landPerPlayer), maxFactionLand);
}
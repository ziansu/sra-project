public int getMaxLand() {
    int landPerPlayer = P.p.getConfig().getInt("hcf.land-per-player", 6);
    int maxFactionLand = P.p.getConfig().getInt("hcf.faction-land-max", 36);
    int initialLand = P.p.getConfig().getInt("hcf.initial-land", 6);
    return (isPermanent()) && (isNormal()) ? maxFactionLand : java.lang.Math.min((initialLand + (((getSize()) - 1) * landPerPlayer)), maxFactionLand);
}
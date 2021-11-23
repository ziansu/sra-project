public double getTotalSAC(int SAC, double attackModifier, int efficiencyStat, int armorEncumbrance) {
    double baseCost = ((double) (SAC)) * attackModifier;
    double totalSac = ((efficiencyStat - ((double) (armorEncumbrance))) - 300) / 1200;
    return baseCost - (totalSac * baseCost);
}
public double getTotalSAC(double SAC, double attackModifier, double efficiencyStat, double armorEncumbrance) {
    double baseCost = SAC * attackModifier;
    double totalSac = (((efficiencyStat - armorEncumbrance) - 300) / 1200) * baseCost;
    return totalSac > baseCost ? 0 : baseCost - totalSac;
}
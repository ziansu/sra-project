public static void createTroop() {
    if ((!((paket.Troops.NTroops) >= (paket.Troops.maxTroops))) && (((Player.credit) - 50) >= 0)) {
        paket.Troops.troops[paket.Troops.NTroops] = new paket.Troop(100, 10, 0, 100);
        (paket.Troops.NTroops)++;
        paket.Player.purchaseTroops(50);
    }
}
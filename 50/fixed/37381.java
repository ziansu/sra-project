private static void StartingMoney() {
    for (int i = 0; i < (Monopoly.playersCount); i++) {
        Monopoly.playersMoney[i] = 1;
        Monopoly.hasMoney[i] = true;
    }
}
public static void payOut() {
    for (int x = 1; x < 9; x++) {
        trading.challenge.game.bank.bankAcc[x] += (trading.challenge.game.bank.bankAcc[0]) / 8;
    }
}
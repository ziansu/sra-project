public static boolean checkMoney(boolean hasMoney, int[] moneyBet) {
    int money = moneyBet[0];
    if (money <= 0) {
        hasMoney = false;
    }
    return hasMoney;
}
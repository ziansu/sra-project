public static void TransferMoney(com.holdup.MoneyHolder from, com.holdup.MoneyHolder to, int amount) {
    int moneyStolen = java.lang.Math.min(from.getAmount(), amount);
    from.substract(moneyStolen);
    to.add(moneyStolen);
}
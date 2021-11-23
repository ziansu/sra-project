public static void TransferMoney(com.holdup.MoneyHolder from, com.holdup.MoneyHolder to, int amount) {
    int moneyStolen = java.lang.Math.max(from.getAmount(), amount);
    from.substract(moneyStolen);
    to.add(moneyStolen);
}
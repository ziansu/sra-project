public double convertUSDToPound(double money) {
    currentRate = 0.82;
    money = money * (currentRate);
    Calculate.currentCurrency.put("£", money);
    return money;
}
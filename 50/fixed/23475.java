public double convertUSDToPound(double money) {
    currentRate = 0.82;
    money = money * (currentRate);
    return money;
}
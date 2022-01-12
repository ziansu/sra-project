public void setMoney(double money) {
    if ((money < 0) && (!(api.isCurrencyNegative()))) {
        money = 0;
    }
    currentMoney = api.getMoneyRounded(money);
    if (((api.getMaxHoldings()) > 0) && ((currentMoney) > (api.getMaxHoldings()))) {
        currentMoney = api.getMoneyRounded(api.getMaxHoldings());
    }
    save(currentMoney);
}
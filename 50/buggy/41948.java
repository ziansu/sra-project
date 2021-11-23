public void decreaseCashByAmount(int amount) {
    this.cashAmount -= amount;
    cashDisburser.putMoney(cashAmount);
}
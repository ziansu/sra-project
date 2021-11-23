public void changeMoney(int dMoney) throws java.lang.Exception {
    if (!(isAffordable((-dMoney))))
        throw new java.lang.Exception("Insufficient cash!");
    
    this.money += dMoney;
}
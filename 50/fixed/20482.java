public void calcMoney() {
    int sum = 0;
    for (warfare.Card crd : hand) {
        if (crd instanceof warfare.MoneyCard) {
            sum += ((warfare.MoneyCard) (crd)).getValue();
        }
    }
    currentMoney = sum;
}
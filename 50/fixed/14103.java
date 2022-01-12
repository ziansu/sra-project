public void insertMoney(double amount) throws edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException {
    if (amount <= 0)
        throw new edu.towson.cis.cosc603.project4.vendingmachine.VendingMachineException(edu.towson.cis.cosc603.project4.vendingmachine.VendingMachine.INVALID_AMOUNT_MESSAGE);
    
    this.balance += amount;
}
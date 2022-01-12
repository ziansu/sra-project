public java.lang.String withdrawCash(int amount, atm.Atm atm) {
    java.lang.String operationOutcome;
    if (getAccount().hasFunds(amount)) {
        int returnedCash = atm.giveCash(amount);
        if (returnedCash > 0) {
            wallet += returnedCash;
            this.account.deduct(amount);
            operationOutcome = "Please wait while your money is being counted.";
        }else {
            operationOutcome = "Unable to complete this transaction";
        }
    }else {
        operationOutcome = "Insufficient funds for this transaction.";
    }
    return operationOutcome;
}
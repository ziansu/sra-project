public void applyInterestAndFee() {
    if (!(directDeposit)) {
        if ((balance) < (Checking.MIN_BAL)) {
            balance -= Checking.FEE;
        }
    }
    balance = (balance) + (((balance) * (Checking.APY)) / (MONTH_PER_YEAR));
}
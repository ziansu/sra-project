public void applyInterestAndFee() {
    if ((balance) < (Savings.MIN_BAL)) {
        balance -= Savings.FEE;
    }
    if (special) {
        balance = (balance) + (((balance) * (Savings.APYS)) / (MONTH_PER_YEAR));
    }else {
        balance = (balance) + (((balance) * (Savings.APY)) / (MONTH_PER_YEAR));
    }
}
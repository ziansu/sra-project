public double getInterest() {
    int datediff = (seconddate) - (firstdate);
    rate = 0.05 / 365;
    double ratetime = java.lang.Math.pow((1 + (rate)), datediff);
    balance = (balance) * ratetime;
    firstdate = seconddate;
    return balance;
}
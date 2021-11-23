public java.lang.String getBalance() {
    if (loggedIn) {
        interestCalculator();
        return "" + (balance);
    }else {
        return "Please Log in first!";
    }
}
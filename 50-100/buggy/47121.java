public void makeWithdrawal(double withdrawal) {
    java.lang.System.out.println(("Current balance is " + (this.getBalance())));
    if ((this.getBalance()) > withdrawal) {
        this.setBalance(((this.getBalance()) - withdrawal));
        java.lang.System.out.println(((withdrawal + " withdrawn.  New balance is ") + (this.getBalance())));
    }else {
        java.lang.System.out.println(("Insufficient funds.  You can only withdraw up to " + (this.getBalance())));
    }
}
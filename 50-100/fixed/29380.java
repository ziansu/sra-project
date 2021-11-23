public int getNumberOfAccounts() {
    int numberOfAccounts = 0;
    for (int i = 0; i < (accounts.length); i++) {
        if ((accounts[i]) != null) {
            numberOfAccounts++;
        }
    }
    return numberOfAccounts;
}
public int getNumberOfAccounts() {
    int numberOfAccounts = 0;
    for (int i = 0; i < ((accounts.length) - 1); i++) {
        if ((accounts[i]) != null) {
            numberOfAccounts++;
        }
    }
    return numberOfAccounts;
}
static com.example.ollie.workoutapp.Account getCurrentAccount() {
    if ((com.example.ollie.workoutapp.Database.currentAccount) == null) {
        throw new java.lang.RuntimeException("No current account. loginToAccount first");
    }
    return com.example.ollie.workoutapp.Database.currentAccount;
}
private void changePlan(Transaction transaction) {
    int index = userAccounts.getIndex(transaction.getNumber());
    User currentUser = userAccounts.getUser(index);
    currentPlan = currentUser.getPlan();
    if ((currentPlan) == "S") {
        currentPlan = "N";
    }else
        if ((currentPlan) == "N") {
            currentPlan = "S";
        }
    
    currentUser.setPlan(currentPlan);
    userAccounts.updateUser(index, currentUser);
}
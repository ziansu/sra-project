public void createBudgetAndAddToUser(money.mezu.mezu.Budget budget, money.mezu.mezu.UserIdentifier uid) {
    android.util.Log.d("", "FirebaseBackend:addBudgetToUser: adding budget to user");
    java.lang.String newBid = createBudget(budget);
    connectBudgetAndUser(newBid, uid.getId().toString(), null);
}
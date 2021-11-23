public static ca.ualberta.cs.expensemaster.ClaimsList getClaimsList(android.content.Context ctx) {
    if ((ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims) == null) {
        ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims = new ca.ualberta.cs.expensemaster.ClaimsList();
        ca.ualberta.cs.expensemaster.ExpenseMasterApplication.loadFromFile(ctx);
    }
    return ca.ualberta.cs.expensemaster.ExpenseMasterApplication.claims;
}
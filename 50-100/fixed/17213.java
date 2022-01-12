public void saveClaimExpenses(ca.ualberta.cmput301w15t13.Models.ExpenseItemList expenseList) {
    if (persistanceController.DataManager.isNetworkAvailable()) {
        for (ca.ualberta.cmput301w15t13.Models.ExpenseItem expense : expenseList.getExpenseList()) {
            network.saveExpense(expense);
        }
    }
    local.saveClaims(ca.ualberta.cmput301w15t13.Controllers.ClaimListSingleton.getClaimList().getClaimArrayList(), persistanceController.DataManager.getCurrentContext());
}
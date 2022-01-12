@java.lang.Override
protected de.budget.BudgetService.Response.AmountListResponse doInBackground(java.lang.String... params) {
    if ((params.length) != 0)
        return null;
    
    try {
        de.budget.BudgetService.Response.AmountListResponse repsonse = de.budget.BudgetAndroid.AsyncTasks.GetItemsAmountForCategoriesTask.myApp.getBudgetOnlineService().getItemsAmountForCategories(de.budget.BudgetAndroid.AsyncTasks.GetItemsAmountForCategoriesTask.myApp.getSession());
        return repsonse;
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return null;
}
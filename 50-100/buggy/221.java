public static void updateExpense(ca.ualberta.cs.team1travelexpenseapp.Expense expense, ca.ualberta.cs.team1travelexpenseapp.Expense newExpense) {
    java.util.ArrayList<ca.ualberta.cs.team1travelexpenseapp.Expense> expenseArray = ca.ualberta.cs.team1travelexpenseapp.ExpenseListController.getCurrentExpenseList().getExpenses();
    expenseArray.set(expenseArray.indexOf(expense), newExpense);
    ca.ualberta.cs.team1travelexpenseapp.ExpenseListController.currentExpenseList.setExpenseList(expenseArray);
    ca.ualberta.cs.team1travelexpenseapp.ExpenseListController.setCurrentExpense(newExpense);
}
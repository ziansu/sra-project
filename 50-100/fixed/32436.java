public budgetapp.util.money.Money calculateDailyPayment() {
    budgetapp.util.money.Money remaining = totalValue.subtract(amountPaid);
    if (!(budgetapp.util.FlagHandler.isFlagSet(flags, budgetapp.util.Installment.INSTALLMENT_POSITIVE))) {
        return budgetapp.util.BudgetFunctions.max(remaining, dailyPayment);
    }else {
        return budgetapp.util.BudgetFunctions.min(remaining, dailyPayment);
    }
}
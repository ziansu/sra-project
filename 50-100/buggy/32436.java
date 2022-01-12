public budgetapp.util.money.Money calculateDailyPayment() {
    if (!(budgetapp.util.FlagHandler.isFlagSet(flags, budgetapp.util.Installment.INSTALLMENT_POSITIVE))) {
        budgetapp.util.money.Money remaining = totalValue.add(amountPaid);
        return budgetapp.util.BudgetFunctions.max(remaining, dailyPayment);
    }else {
        budgetapp.util.money.Money remaining = totalValue.subtract(amountPaid);
        return budgetapp.util.BudgetFunctions.min(remaining, dailyPayment);
    }
}
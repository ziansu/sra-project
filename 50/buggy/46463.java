public void setExpenseCategory(java.lang.String expenseCategory) throws exceptions.InvalidFieldEntryException {
    if (!(this.allowedCategories.contains(expenseCategory))) {
        throw new exceptions.InvalidFieldEntryException("Not a valid Category");
    }else {
        this.ExpenseCategory = expenseCategory;
    }
}
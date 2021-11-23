@java.lang.Override
public void processModel(com.valevich.moneytracker.database.data.ExpenseEntry expense) {
    expense.setDate(date);
    expense.setDescription(description);
    expense.setPrice(amount);
    expense.associateCategory(category);
    category.save();
    expense.save();
}
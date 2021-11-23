private void setCategoryInput() {
    categoryInput = new org.iabako.client.ui.layout.widget.expense.ExpenseCategoryField();
    categoryInput.setTableMode(true);
    categoryInput.category.setStyleLayout("");
    categoryInput.anotherCategory.setStyleLayout("");
    categoryInput.category.setStyleName(((categoryInput.category.getStyleName()) + " inputsize79 inputbig"));
    categoryInput.anotherCategory.setStyleName(((categoryInput.anotherCategory.getStyleName()) + " inputsize76 inputbig"));
    addToCustomPanel(categoryInput);
    priceInfoContainer.setExpensesDefaultView(this);
}
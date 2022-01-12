public void onSuccess(java.lang.Void result) {
    expenseLine.removeFromParent();
    saleExpensesList.expenses.remove(expense);
    ((org.iabako.client.ui.form.business.sale.make.SaleMakeForm) (parentForm)).saleMakeProductServiceChoice.saleTotalTable.calculateAmounts();
    org.iabako.client.ui.layout.widget.validation.ValidationMessage messages = org.iabako.client.ui.layout.widget.validation.ValidationMessage.getFirstFromDOM();
    messages.showSuccessMessage("validation_expense_delete_success");
    org.iabako.client.user.AuthenticateUserProvider.getTrackingPanel().refresh(TrackingType.expenseDelete);
    super.onSuccess(result);
}
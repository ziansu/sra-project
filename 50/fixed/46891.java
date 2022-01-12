private void showTotalAmount() {
    double amount = 0.0;
    for (com.pulsardev.homebudgettracker.model.IncomeCategory item : listInCategories) {
        amount += item.getAmount();
    }
    txtTotalAmount.setText(((java.lang.String.valueOf(amount)) + " USD"));
}
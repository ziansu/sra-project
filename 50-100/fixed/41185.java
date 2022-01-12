private void setPromptVisibility() {
    if ((getView()) == null) {
        return ;
    }
    android.widget.TextView noExpenses = ((android.widget.TextView) (getView().findViewById(R.id.noExpensesTextView)));
    if ((claim.getExpenseCount()) == 0) {
        noExpenses.setVisibility(View.VISIBLE);
    }else {
        noExpenses.setVisibility(View.INVISIBLE);
    }
}
private void setNoBudgetsIndication() {
    findViewById(R.id.loading_spinner).setVisibility(View.GONE);
    if ((this.mapOfBudgets.size()) > 0) {
        findViewById(R.id.crying_logo).setVisibility(View.GONE);
        findViewById(R.id.explaining_text).setVisibility(View.GONE);
    }else {
        findViewById(R.id.crying_logo).setVisibility(View.VISIBLE);
        ((android.widget.TextView) (findViewById(R.id.explaining_text))).setText(getResources().getString(R.string.no_budgets_message));
    }
}
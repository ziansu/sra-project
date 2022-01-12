private void updateResults(android.widget.EditText updatableEditText, java.lang.String newCurrency) {
    custom.selfapps.rav.calc.currency.model.Currency currency = ((custom.selfapps.rav.calc.MainActivity) (getActivity())).getCurrency();
    double res = currency.getRelation(java.lang.Double.parseDouble(getScreenValue()), selectedFromValue, spinnerToValue);
    updatableEditText.setText(java.lang.String.format(java.util.Locale.getDefault(), "%.2f", res));
}
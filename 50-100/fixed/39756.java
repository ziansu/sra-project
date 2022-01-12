public void onClick(android.view.View v) {
    double incomeEntered = java.lang.Double.parseDouble(individualIncomeEntered.getText().toString());
    java.text.DecimalFormat currency = new java.text.DecimalFormat("$###,###.##");
    taxDue.setText(currency.format(com.example.helenmiller.taxcalculator.TaxBrackets.getTaxBurden(incomeEntered, true, true)));
}
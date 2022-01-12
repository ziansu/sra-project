public void onClick(android.view.View i) {
    tempMonthly = java.lang.Double.parseDouble(monthlyDue.getText().toString());
    tempBill = billName.getText().toString();
    tempIntrest = java.lang.Double.parseDouble(intrestRate.getText().toString());
    tempTotal = java.lang.Double.parseDouble(totalDue.getText().toString());
    android.content.Intent j = new android.content.Intent(d, lowercasewon.oneup.CurrentDebts.class);
    startActivity(j);
}
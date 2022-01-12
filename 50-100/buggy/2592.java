public void onClick(android.view.View i) {
    tempMonthly = java.lang.Double.parseDouble(monthlyDue.toString());
    tempIntrest = java.lang.Double.parseDouble(intrestRate.toString());
    tempTotal = java.lang.Double.parseDouble(totalDue.toString());
    tempBill = billName.toString();
    android.content.Intent j = new android.content.Intent(d, lowercasewon.oneup.CurrentDebts.class);
    startActivity(j);
}
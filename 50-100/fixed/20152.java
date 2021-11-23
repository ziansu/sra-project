public java.lang.String getCSV() {
    java.text.NumberFormat formatter = new java.text.DecimalFormat("#0.00");
    return (((((((((formatter.format(bankId)) + ", ") + (formatter.format(householdId))) + ", ") + (formatter.format(totalAmount))) + ", ") + (formatter.format(amountLeft))) + ", ") + (formatter.format(interestRate))) + ", ";
}
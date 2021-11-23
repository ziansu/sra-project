public void setAmount(double amount) {
    lblAmount.setText(((java.lang.String.valueOf(noDec.format(amount))) + (theProduct.getUnitSuffix())));
}
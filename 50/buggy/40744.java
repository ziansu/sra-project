public static void setCalcValue(java.lang.String value) {
    value = value.substring(0, ((CalcView.roundingLengthBeforeDecimal) + (CalcView.roundingLengthAfterDecimal)));
    CalcView.calcText.setText(value);
}
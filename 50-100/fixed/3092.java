public static void setCalcValue(java.lang.String value) {
    if ((value.length()) > ((CalcView.roundingLengthBeforeDecimal) + (CalcView.roundingLengthAfterDecimal))) {
        value = value.substring(0, ((CalcView.roundingLengthBeforeDecimal) + (CalcView.roundingLengthAfterDecimal)));
    }
    CalcView.calcText.setText(value);
}
public void setCurrentTemp(double currentTemp) {
    java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("###");
    mCurrentTemp = decimalFormat.format(java.lang.Math.round(currentTemp));
}
public java.lang.String formatAxisYDegreePercent(double value, double midValue) {
    if (midValue == 0)
        return "";
    
    double displayValue = ((value - midValue) * 100) / midValue;
    if (displayValue < 0) {
        return (new java.text.DecimalFormat("-#,##0.00").format(displayValue)) + "%";
    }else {
        return (new java.text.DecimalFormat("#,##0.00").format(displayValue)) + "%";
    }
}
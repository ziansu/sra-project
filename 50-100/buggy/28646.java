public static championpicker.uncertainty.UncertainValue parseUncertainValue(java.lang.String str) {
    double value = java.lang.Double.parseDouble(str.substring(0, ((str.indexOf("+")) - 1)));
    int confidence = java.lang.Integer.parseInt(str.substring(((str.indexOf("+c")) + 3)));
    return new championpicker.uncertainty.UncertainValue(value, confidence);
}
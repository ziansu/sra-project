public static championpicker.uncertainty.UncertainValue parseUncertainValue(java.lang.String str) {
    double value = java.lang.Double.parseDouble(str.substring(0, ((str.indexOf("+")) - 1)).trim());
    int confidence = java.lang.Integer.parseInt(str.substring(((str.indexOf("+c")) + 3)).trim());
    return new championpicker.uncertainty.UncertainValue(value, confidence);
}
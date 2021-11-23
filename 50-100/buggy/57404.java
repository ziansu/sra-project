public java.lang.String getI18nValue() {
    if ((isNumber()) && (null != (measure))) {
        java.text.NumberFormat nf = new java.text.DecimalFormat("#,##0.#", java.text.DecimalFormatSymbols.getInstance(new java.util.Locale("fi")));
        nf.setMaximumFractionDigits(measure.getDecimals());
        nf.setMinimumFractionDigits(measure.getDecimals());
        nf.setRoundingMode(java.math.RoundingMode.HALF_UP);
        return nf.format(getNumberValue());
    }
    return value;
}
public java.lang.String getI18nValue() {
    if ((isNumber()) && (null != (measure))) {
        java.text.NumberFormat nf = new java.text.DecimalFormat("#,##0.#", java.text.DecimalFormatSymbols.getInstance(new java.util.Locale("fi")));
        return format(nf);
    }
    return value;
}
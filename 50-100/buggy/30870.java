public static java.lang.Double parseDouble(java.lang.String numberToParse) throws java.text.ParseException {
    char separator = '.';
    if ((numberToParse.split(",").length) > 0) {
        separator = ',';
    }
    java.text.DecimalFormatSymbols symbols = new java.text.DecimalFormatSymbols();
    symbols.setDecimalSeparator(separator);
    java.text.DecimalFormat format = new java.text.DecimalFormat("#.#");
    format.setMinimumFractionDigits(0);
    format.setDecimalFormatSymbols(symbols);
    return format.parse(numberToParse).doubleValue();
}
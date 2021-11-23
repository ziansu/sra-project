private java.lang.String calculateAndFormatResult(com.robinkanters.athena.Operation operation) {
    return decimalFormatter.formatDouble(calculateResult(operation));
}
private java.lang.String calculateAndFormatResult(com.robinkanters.athena.Operation operation) {
    return decimalFormatter.format(calculateResult(operation));
}
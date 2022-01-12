private static com.thoughtworks.pos.domains.ShoppingChart ParseShoppingChartFromFile(java.lang.String arg) throws java.io.IOException {
    com.thoughtworks.pos.services.services.InputParser inputParser = new com.thoughtworks.pos.services.services.InputParser(new java.io.File(arg));
    return inputParser.parser();
}
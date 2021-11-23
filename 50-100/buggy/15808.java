public static com.alphatica.genotick.ui.UserOutput getUserOutput(com.alphatica.genotick.ui.Parameters parameters) throws java.io.IOException {
    java.lang.String output = parameters.getValue(com.alphatica.genotick.ui.UserInputOutputFactory.OUTPUT_STRING);
    parameters.removeKey(com.alphatica.genotick.ui.UserInputOutputFactory.OUTPUT_STRING);
    if ((output != null) && (output.equals("csv")))
        com.alphatica.genotick.ui.UserInputOutputFactory.userOutput = new com.alphatica.genotick.ui.CsvOutput();
    else
        com.alphatica.genotick.ui.UserInputOutputFactory.userOutput = new com.alphatica.genotick.ui.ConsoleOutput();
    
    return com.alphatica.genotick.ui.UserInputOutputFactory.userOutput;
}
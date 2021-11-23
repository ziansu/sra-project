public static edu.wright.hendrix11.cs7830.machine.LinearMachine getLinearStockMachine(java.util.List<edu.wright.hendrix11.cs7830.Stock> stocks, java.util.function.Function<edu.wright.hendrix11.cs7830.StockData, ? extends java.lang.Number>... inData) {
    java.util.List<java.lang.Double>[] inputs = edu.wright.hendrix11.cs7830.machine.StockMachineFactory.processInputs(stocks, inData).toArray(new java.util.List[0]);
    java.util.List<java.lang.Double> outputs = edu.wright.hendrix11.cs7830.machine.StockMachineFactory.processOutputs(stocks, inputs.length);
    return new edu.wright.hendrix11.cs7830.machine.LinearMachine(outputs, inputs);
}
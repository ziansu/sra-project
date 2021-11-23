public Calculator Copy() {
    Calculator calculator = new Calculator();
    calculator.function_table = this.function_table;
    calculator.variable_table = this.variable_table;
    return calculator;
}
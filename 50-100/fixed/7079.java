private double calculate(us.team.awesome.calculator.math.CalculationList list) throws us.team.awesome.calculator.util.MathException {
    if (list.isEmpty()) {
        return 0;
    }
    int index = getNextOperatorToCalculate(list);
    if (index > 0) {
        us.team.awesome.calculator.math.CalculationOperator operator = ((us.team.awesome.calculator.math.CalculationOperator) (list.get(index)));
        list = operator.calculate(index, list);
        return calculate(list);
    }else {
        return ((us.team.awesome.calculator.math.CalculationNumber) (list.getFirst())).getValue();
    }
}
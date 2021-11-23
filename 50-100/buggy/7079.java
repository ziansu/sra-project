private double calculate(us.team.awesome.calculator.math.CalculationList list) throws us.team.awesome.calculator.util.MathException {
    if (list.isEmpty()) {
        return 0;
    }
    int index = getNextOperatorToCalculate();
    if (index > 0) {
        us.team.awesome.calculator.math.CalculationOperator operator = ((us.team.awesome.calculator.math.CalculationOperator) (list.get(index)));
        us.team.awesome.calculator.math.CalculationList _list = operator.calculate(index, list);
        return calculate(_list);
    }else {
        return ((us.team.awesome.calculator.math.CalculationNumber) (list.getFirst())).getValue();
    }
}
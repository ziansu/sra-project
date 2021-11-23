@butterknife.OnClick(value = R.id.calculator_options_parenthesis)
public void onParenthesis() {
    equation = equationHandler.handleParenthesis(equation);
    if (equation.endsWith(")")) {
        answer = calculator.calculate(equation);
    }
    updateLastCalculatorResultItem();
}
@butterknife.OnClick(value = R.id.numpad_backspace)
public void onBackspace() {
    if ((equation.length()) > 0) {
        equation = equationHandler.handleBackspace(equation);
        answer = calculator.calculate(equation);
        updateLastCalculatorEntry();
    }
}
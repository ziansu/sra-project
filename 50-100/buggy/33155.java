public void calculate() {
    java.lang.Number result;
    if ((_operand) == null) {
        result = java.lang.Integer.valueOf(getDisplay());
    }else {
        result = _operation.calculate(_operand, java.lang.Integer.valueOf(getDisplay()));
    }
    _appendMode = false;
    _operand = result;
    setDisplay(result.toString());
}
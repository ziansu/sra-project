public void divide() {
    pushUserText();
    if ((model.getCalcValue().toPlainString().equals("0")) || (model.getCalcValue().toPlainString().equals("0.0"))) {
        view.setCalcValue("Syntax Error");
    }else {
        model.divide();
        showValue();
    }
}
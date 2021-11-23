private void replaceLast(java.lang.String newString) {
    java.lang.String text = secondScreen.getText();
    int lastSpace = text.lastIndexOf(com.implemica.zavizionov.calculator.CalculatorFormatter.SPACE_SYMBOL);
    int lastIndex = (lastSpace == (-1)) ? 0 : lastSpace;
    setSecondScreenText(((text.substring(0, lastIndex)) + newString));
}
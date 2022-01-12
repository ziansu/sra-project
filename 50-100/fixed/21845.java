private void setupPanel() {
    this.setLayout();
    this.add(fibonacciButton);
    this.add(factorialButton);
    this.add(inputField);
    this.add(resultsArea);
    resultsArea.setWrapStyleWord(true);
    resultsArea.setLineWrap(true);
    resultsArea.setEditable(false);
    this.setBackground(java.awt.Color.CYAN);
}
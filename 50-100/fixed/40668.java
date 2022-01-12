@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        result.setText("");
        calculator.calculate(expressionArea.getText());
        result.setCaretPosition(0);
    } catch (com.teamdev.calculator.CalculationError calculationError) {
        javax.swing.JOptionPane.showMessageDialog(getParent(), calculationError.getMessage());
        expressionArea.setCaretPosition(expressionArea.getText().length());
        expressionArea.getCaret().setVisible(true);
    }
}
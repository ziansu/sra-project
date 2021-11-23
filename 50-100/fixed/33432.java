@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String entryText = entryDisplay.getText();
    if (entryText.trim().isEmpty()) {
        return ;
    }
    if (entryText.startsWith(MathExpressionParser.NEGATIVE_SIGN)) {
        entryDisplay.setText(entryText.substring(1, entryText.length()));
    }else {
        entryDisplay.setText(((MathExpressionParser.NEGATIVE_SIGN) + (entryText.trim())));
    }
}
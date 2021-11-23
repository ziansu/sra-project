@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.String input = inputField.getText();
    java.lang.String[] output = uiController.processUserInput(input);
    textArea.append((input + (ui.CommandLinePanel.NEXT_LINE)));
    for (java.lang.String s : output) {
        textArea.append((s + (ui.CommandLinePanel.NEXT_LINE)));
    }
    inputField.setText(ui.CommandLinePanel.STRING_EMPTY);
}
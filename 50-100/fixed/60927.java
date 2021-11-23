@java.lang.Override
public void focusLost(java.awt.event.FocusEvent e) {
    command.setForeground(new java.awt.Color(128, 128, 128));
    java.lang.String input = command.getText();
    if ((!(isMessageDisplayed)) && ((input.length()) <= 0)) {
        command.setText("Enter commands here");
        isMessageDisplayed = true;
    }else {
        command.setText(input);
    }
}
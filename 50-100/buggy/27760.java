@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JButton pressedButton = ((javax.swing.JButton) (e.getSource()));
    java.lang.System.out.println(buttonMap.get(pressedButton));
    coordinates = buttonMap.get(pressedButton).split(" ");
    if (controller.validateSelf(coordinates[0], coordinates[1])) {
        pressedButton.setBackground(java.awt.Color.BLUE);
        pressedButton.setEnabled(false);
    }else {
        displayErrorMessage("It is not your turn.");
    }
}
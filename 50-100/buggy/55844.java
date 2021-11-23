public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JCheckBox eventBox = ((javax.swing.JCheckBox) (e.getSource()));
    java.lang.String eventText = eventBox.getText();
    java.lang.String eventDay = ((javax.swing.JLabel) (eventBox.getParent().getComponent(0))).getText();
    if (!(eventBox.isSelected())) {
        helper = new SGHelper(eventText, options, boxGrid, eventDay);
    }
}
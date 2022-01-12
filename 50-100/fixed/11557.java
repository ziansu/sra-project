@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    try {
        model.deleteCropLocationTrayLocation(blockID.getText(), bedID.getText(), cropName.getText(), varietyField.getText());
        errorLabel.setText("");
    } catch (java.sql.SQLException e1) {
        errorLabel.setText("Invalid Field");
    }
    repaint();
    revalidate();
}
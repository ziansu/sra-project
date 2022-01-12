@java.lang.Override
public void focusLost(java.awt.event.FocusEvent e) {
    for (int i = 0; i < (textFields.size()); i++) {
        javax.swing.JTextField jText = textFields.get(i);
        if ((e.getSource()) == jText) {
            batchState.setValue(new client.gui.batchstate.Cell(recordList.getSelectedIndex(), (i + 1)), jText.getText());
        }
    }
}
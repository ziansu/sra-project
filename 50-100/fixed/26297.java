@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if (e.getActionCommand().equals("comboBoxEdited")) {
        wwd.highlight(((java.lang.String) (((javax.swing.JComboBox) (e.getSource())).getSelectedItem())));
    }
}
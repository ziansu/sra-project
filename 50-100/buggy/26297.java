@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    java.lang.System.out.println(e.getActionCommand());
    if (e.getActionCommand().equals("comboBoxEdited")) {
        wwd.highlight(((java.lang.String) (((javax.swing.JComboBox) (e.getSource())).getSelectedItem())));
    }
}
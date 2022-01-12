@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((list.getSelectedValue()) == null) {
        javax.swing.JOptionPane.showMessageDialog(null, "Please choose a word to modify!", MainFrame.frameName, javax.swing.JOptionPane.ERROR_MESSAGE);
    }else {
        new MainFrame.ModifyWordFrame(dict, list.getSelectedValue());
    }
}
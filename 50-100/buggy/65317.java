@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((wordList.getSelectedValue()) == null) {
        javax.swing.JOptionPane.showMessageDialog(null, "Please choose a word to modify!", MainFrame.frameName, javax.swing.JOptionPane.ERROR_MESSAGE);
    }else {
        new MainFrame.ModifyWordFrame(dict, wordList.getSelectedValue());
    }
}
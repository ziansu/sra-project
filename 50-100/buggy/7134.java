@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    name.kion.twipstr.gui.LinkLabel info = new name.kion.twipstr.gui.LinkLabel(name.kion.twipstr.Constants.APP_INFO_NAME_AND_VERSION, name.kion.twipstr.Constants.APP_INFO_URL);
    name.kion.twipstr.gui.LinkLabel author = new name.kion.twipstr.gui.LinkLabel(name.kion.twipstr.Constants.APP_INFO_AUTHOR, name.kion.twipstr.Constants.APP_INFO_AUTHOR_URL);
    javax.swing.JLabel help = new javax.swing.JLabel(name.kion.twipstr.Constants.APP_INFO_HELP);
    javax.swing.JOptionPane.showMessageDialog(frameTwipstr, new java.awt.Component[]{ info , author , help }, "Twipstr :: About & Help", javax.swing.JOptionPane.PLAIN_MESSAGE, infoIcon);
    statusTextArea.requestFocusInWindow();
}
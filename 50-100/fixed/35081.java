public void actionPerformed(java.awt.event.ActionEvent e) {
    if (((getUserName()) != null) && ((getUserName().length()) > 0)) {
        controller.login(tfUserName.getText().toString());
        frame.setVisible(false);
    }else {
        javax.swing.JOptionPane.showMessageDialog(null, "You must enter a username!");
    }
}
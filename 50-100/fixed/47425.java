@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent ae) {
    if (("root".equals(jpfPassword.getText())) && ("root".equals(jtfUsername.getText()))) {
        user.User user = new user.UserSearch("root").getUsers().get(0);
        updateBar(ae, user);
    }else {
        statusLabel.setText("Invalid username or password");
    }
}
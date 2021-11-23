public void check() {
    if ((name.equals(names[0])) && (password.equals("password"))) {
        launchActivity();
    }
    if (!(name.equals(names[0]))) {
        Notification.setText("Invalid User");
    }else {
        Notification.setText("Wrong Pass");
        pass.setText("");
    }
    return ;
}
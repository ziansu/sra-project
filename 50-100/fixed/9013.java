public void check() {
    if ((name.equals(names[0])) && (password.equals("password"))) {
        launchActivity();
        return ;
    }
    if (!(name.equals(names[0]))) {
        Notification.setText("Invalid User");
    }else {
        Notification.setText("Wrong Pass");
        pass.setText("");
    }
    return ;
}
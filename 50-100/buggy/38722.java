public void actionPerformed(java.awt.event.ActionEvent e) {
    username = display.getUsername();
    password = display.getPassword();
    authen = new model.Authentication();
    if (authen.loginSuccess(username, password)) {
        menu.setVisible(true);
        display.dispose();
    }else {
        display.showPopUp("Wrong Username or Password");
    }
    menu = new controller.MenuControl();
    display.dispose();
}
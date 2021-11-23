public void actionPerformed(java.awt.event.ActionEvent e) {
    username = display.getUsername();
    password = display.getPassword();
    authen = new model.Authentication();
    if (authen.loginSuccess(username, password)) {
        menu = new controller.MenuControl();
        display.dispose();
    }else {
        display.showPopUp("Wrong Username or Password");
    }
}
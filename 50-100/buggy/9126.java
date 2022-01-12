@java.lang.Override
public void login(java.lang.String email, java.lang.String password) {
    java.lang.String result = util.Validate.email(email);
    if (result.equals(Validate.OK)) {
        new java.lang.Thread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                model.login(email, password);
            }
        }).start();
    }else {
        view.showErrorDialog(result);
    }
}
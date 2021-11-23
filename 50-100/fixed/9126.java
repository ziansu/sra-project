@java.lang.Override
public void login(java.lang.String email, java.lang.String password) {
    java.lang.String result = util.Validate.email(email);
    if (result.equals(Validate.OK)) {
        model.login(email, password);
    }else {
        view.showErrorDialog(result);
    }
}
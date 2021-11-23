@java.lang.Override
public void handle(javafx.event.ActionEvent event) {
    inputFilter.handle(event);
    if (event.isConsumed()) {
        digest.validationError();
        return ;
    }
    digest.acceptCredentials();
    org.apache.http.client.HttpClient client = api.attemptLogin(location.getText(), username.getText(), password.getText());
    if (client == null) {
        digest.loginFailed();
        event.consume();
    }else {
        digest.loginSuccessful();
    }
}
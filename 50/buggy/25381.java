@java.lang.Override
public void success(java.util.List<com.fivelabs.myfuelcloud.model.User> users, retrofit.client.Response response) {
    getUser(mUsernameView.getText().toString());
    com.fivelabs.myfuelcloud.util.Session.getsUser().setToken(com.fivelabs.myfuelcloud.util.Common.generateToken(username, password));
}
@java.lang.Override
public void success(java.util.List<com.fivelabs.myfuelcloud.model.User> users, retrofit.client.Response response) {
    getUser(mUsernameView.getText().toString());
}
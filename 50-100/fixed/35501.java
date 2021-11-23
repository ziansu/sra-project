@java.lang.Override
public void doLogin(android.app.Activity context, java.lang.String email, java.lang.String password, java.lang.String deviceId) {
    if ((password.length()) < 3) {
        mView.onPasswordError();
        return ;
    }
    gem.training3.enterprisenetwork.network.ServiceBuilder.getService().login(new gem.training3.enterprisenetwork.network.dto.UserInfoDTO(email, password, deviceId)).enqueue(mLoginCallback);
}
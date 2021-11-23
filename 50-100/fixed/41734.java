public void onEvent(cn.jpush.im.android.api.event.LoginStateChangeEvent event) {
    cn.jpush.im.android.api.event.LoginStateChangeEvent.Reason reason = event.getReason();
    switch (reason) {
        case user_password_change :
            fireEvent("onUserPasswordChanged", null);
            break;
        case user_logout :
            fireEvent("onUserLogout", null);
            break;
        case user_deleted :
            fireEvent("onUserDeleted", null);
            break;
        default :
    }
}
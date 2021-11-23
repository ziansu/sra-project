@java.lang.Override
public void onSuccess(java.lang.Void aVoid) {
    if (((user) != null) && (user.getSource().equals(UserSource.google))) {
        Window.Location.replace(logoutUrl);
    }else {
        loginListener.onLogout();
    }
}
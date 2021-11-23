@android.webkit.JavascriptInterface
public void deliver(java.lang.String username, java.lang.String password) {
    java.lang.String userNameAndPass = (edu.txstate.mobile.tracs.util.AppStorage.get(AppStorage.USERNAME, context)) + (edu.txstate.mobile.tracs.util.AppStorage.get(AppStorage.PASSWORD, context));
    if (!(userNameAndPass.equals((username + password)))) {
        edu.txstate.mobile.tracs.util.AppStorage.put(AppStorage.USERNAME, username, context);
        edu.txstate.mobile.tracs.util.AppStorage.put(AppStorage.PASSWORD, password, context);
    }
    edu.txstate.mobile.tracs.util.LoginStatus.getInstance().login();
}
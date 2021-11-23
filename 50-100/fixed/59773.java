@java.lang.Override
public void onConnected(android.os.Bundle bundle) {
    if (((listener) != null) && ((listener.get()) != null)) {
        listener.get().onStatusChanged(true, com.annahid.libs.artenus.unified.impl.GoogleLoginManager.LOGIN_MASK);
    }
    mSignInClicked = false;
}
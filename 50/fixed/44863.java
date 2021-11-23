@java.lang.Override
public void onError(com.firebase.client.FirebaseError error) {
    postEvent(LoginEvent.onFailedRecoverSession);
}
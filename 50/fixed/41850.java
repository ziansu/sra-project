@java.lang.Override
public void onSuccess(com.quickblox.auth.model.QBSession result, android.os.Bundle params) {
    creatingSessionCallback.onSuccess(result, params);
}
@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if ((mCallbacks) != null) {
        mCallbacks.searchingForChat();
    }
}
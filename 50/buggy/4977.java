@java.lang.SuppressWarnings(value = "unused")
public void onActivityResult(android.app.Activity activity, int resultCode, @android.support.annotation.NonNull
android.content.Intent data) {
    if (resultCode == (android.app.Activity.RESULT_OK)) {
        processEvent(data);
        return ;
    }
    callback.onCanceled();
}
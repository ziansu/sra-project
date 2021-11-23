@java.lang.Override
public void onSuccess(com.google.firebase.storage.UploadTask.TaskSnapshot taskSnapshot) {
    android.util.Log.d(io.invertase.firebase.storage.RNFirebaseStorage.TAG, ("putFile success " + taskSnapshot));
    com.facebook.react.bridge.WritableMap resp = getUploadTaskAsMap(taskSnapshot);
    sendJSEvent(io.invertase.firebase.storage.RNFirebaseStorage.STORAGE_STATE_CHANGED, path, resp);
    resp = getUploadTaskAsMap(taskSnapshot);
    sendJSEvent(io.invertase.firebase.storage.RNFirebaseStorage.STORAGE_UPLOAD_SUCCESS, path, resp);
    resp = getUploadTaskAsMap(taskSnapshot);
    promise.resolve(resp);
}
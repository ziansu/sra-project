@com.pilloxa.backgroundjob.ReactMethod
public void getAll(com.pilloxa.backgroundjob.Callback callback) {
    android.util.Log.d(LOG_TAG, "RN Getting aall");
    com.pilloxa.backgroundjob.WritableArray jobs = _getAll();
    callback.invoke(jobs);
}
@java.lang.Override
public void on(java.lang.Throwable throwable) {
    if (throwable != null) {
        android.util.Log.e(fr.esir.services.Context_service.TAG, throwable.toString());
    }
}
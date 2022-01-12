@java.lang.Override
public final void onFailure(retrofit2.Call<T> call, java.lang.Throwable t) {
    android.util.Log.e(edu.byu.support.retrofit.ByuCallback.TAG, "onFailure: ", t);
    if ((!(call.isCanceled())) && ((callManager) != null)) {
        callManager.removeCall(call);
        retryCall(call, null, t);
    }
}
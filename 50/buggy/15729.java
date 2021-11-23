@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError err) {
    retrofit.client.Response resp = err.getResponse();
    android.util.Log.v("Error :", ("err: " + (resp.toString())));
    return err;
}
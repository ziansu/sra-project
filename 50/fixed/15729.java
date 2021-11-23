@java.lang.Override
public java.lang.Throwable handleError(retrofit.RetrofitError err) {
    if (err != null) {
        retrofit.client.Response resp = err.getResponse();
        android.util.Log.v("Error :", ("err: " + (resp.toString())));
        return err;
    }
}
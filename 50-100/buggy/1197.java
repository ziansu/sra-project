@java.lang.Override
public void failure(retrofit.RetrofitError error) {
    java.lang.String errorJson = new java.lang.String(((retrofit.mime.TypedByteArray) (error.getResponse().getBody())).getBytes());
    android.util.Log.d("RESTMANAGER: ", "Token update FAILED!");
    android.widget.Toast.makeText(context, errorJson, Toast.LENGTH_LONG).show();
    if ((error.getResponse().getStatus()) == 401) {
    }
}
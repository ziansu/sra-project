@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, byte[] errorResponse, java.lang.Throwable e) {
    try {
        android.widget.Toast.makeText(getActivity(), getString(R.string.network_troubles), Toast.LENGTH_SHORT).show();
        getActivity().finish();
    } catch (java.lang.IllegalStateException e1) {
        android.util.Log.d("DEBUG", "not attached to Activity");
    } finally {
        progressDialog = null;
    }
}
@java.lang.Override
public void onFailure(int statusCode, org.apache.http.Header[] headers, java.lang.Throwable throwable, org.json.JSONObject errorResponse) {
    android.util.Log.d("mentions timeline fail", errorResponse.toString());
    android.widget.Toast.makeText(getActivity(), R.string.get_timeline_fail, Toast.LENGTH_SHORT).show();
}
@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    android.widget.Toast.makeText(getContext(), R.string.failed_performing_request, Toast.LENGTH_SHORT).show();
}
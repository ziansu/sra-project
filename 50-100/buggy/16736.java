@java.lang.Override
public void onFailure(okhttp3.Call call, java.io.IOException e) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            android.widget.Toast.makeText(getActivity(), R.string.status_failed, Toast.LENGTH_SHORT).show();
        }
    });
}
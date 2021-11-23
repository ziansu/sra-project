@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    java.lang.String jsonData = response.body().string();
    if (response.isSuccessful()) {
        mMovies = extractMoviesFromJson(jsonData);
        if ((getActivity()) == null) {
            android.widget.Toast.makeText(getActivity(), "Activity is null", Toast.LENGTH_SHORT).show();
        }
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                updateDisplay();
            }
        });
    }
}
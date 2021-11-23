@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    java.lang.String jsonData = response.body().string();
    if (response.isSuccessful()) {
        mMovies = extractMoviesFromJson(jsonData);
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                updateDisplay();
            }
        });
    }
}
@java.lang.Override
public void onResponse(com.squareup.okhttp.Response response) throws java.io.IOException {
    java.lang.String jsonData = response.body().string();
    org.json.JSONObject reviewsObject;
    extractReviewsFromJson(jsonData);
    if (response.isSuccessful()) {
        getActivity().runOnUiThread(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                createReviewViews();
            }
        });
    }
}
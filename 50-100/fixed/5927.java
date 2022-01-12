@java.lang.Override
public void onResponse(retrofit2.Call<com.arman.horus.models.PlaceDetail> call, retrofit2.Response<com.arman.horus.models.PlaceDetail> response) {
    if (!(response.isSuccessful())) {
        android.util.Log.d(com.arman.horus.activities.PlaceDetailActivity.LOG_TAG, "Request wasn't successful!");
        dialog.dismiss();
        return ;
    }
    showPlaceDetail(response.body());
    dialog.dismiss();
}
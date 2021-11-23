@java.lang.Override
public void onResponse(retrofit2.Call<okhttp3.ResponseBody> call, retrofit2.Response<okhttp3.ResponseBody> response) {
    android.util.Log.d("RESPONSE", "Feed Remove");
    mFeedList.remove(position);
}
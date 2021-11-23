@java.lang.Override
public void onFailure(retrofit2.Call<java.util.List<de.dominikwieners.androidhive.model.Post>> call, java.lang.Throwable t) {
    progressDoalog.dismiss();
    android.util.Log.d("RetrofitResponse", "Error");
}
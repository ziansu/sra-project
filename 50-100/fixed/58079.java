@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<de.dominikwieners.androidhive.model.Post>> call, retrofit2.Response<java.util.List<de.dominikwieners.androidhive.model.Post>> response) {
    android.util.Log.d("RetrofitResponse", ("Status Code " + (response.code())));
    postItemList = response.body();
    postList.setHasFixedSize(true);
    postList.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(getApplicationContext()));
    postList.setAdapter(new de.dominikwieners.androidhive.adapter.PostAdapter(getApplicationContext(), postItemList));
    progressDoalog.dismiss();
}
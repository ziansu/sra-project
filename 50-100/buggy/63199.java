@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.example.geniusplaza.sample.POJO.Posts>> call, retrofit2.Response<java.util.List<com.example.geniusplaza.sample.POJO.Posts>> response) {
    android.util.Log.d("Main Activity", "inside nRespose successful ");
    mAdapter.updateData(mPosts);
    android.util.Log.d("aaaaaaaa", response.body().get(0).getId().toString());
}
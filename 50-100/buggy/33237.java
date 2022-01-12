@java.lang.Override
public void onResponse(retrofit2.Call<java.util.List<com.example.chao.retrofitdemo.service.GitHubClient.Contributor>> call, retrofit2.Response<java.util.List<com.example.chao.retrofitdemo.service.GitHubClient.Contributor>> response) {
    java.util.List<com.example.chao.retrofitdemo.service.GitHubClient.Contributor> contributors = response.body();
    if (contributors != null) {
        for (com.example.chao.retrofitdemo.service.GitHubClient.Contributor contributor : contributors) {
            android.util.Log.i("QWC", ((((contributor.login) + " (") + (contributor.contributions)) + ")"));
        }
    }else {
        android.util.Log.i(com.example.chao.retrofitdemo.MainActivity.TAG, "onResponse-onFailure");
    }
}
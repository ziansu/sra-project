@java.lang.Override
public void onResponse(retrofit2.Call<com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Article>> call, retrofit2.Response<com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Article>> response) {
    com.desk.java.apiclient.model.ApiResponse<com.desk.java.apiclient.model.Article> apiResponse = response.body();
    if (apiResponse == null) {
        callbacks.onArticlesLoaded(0, new java.util.ArrayList<com.desk.java.apiclient.model.Article>(), false);
        return ;
    }
    callbacks.onArticlesLoaded(apiResponse.getPage(), apiResponse.getEntriesAsList(), apiResponse.hasNextPage());
}
@java.lang.Override
public void onResponse(retrofit2.Call<java.util.ArrayList<com.app.donteatalone.model.InfoBlog>> call, retrofit2.Response<java.util.ArrayList<com.app.donteatalone.model.InfoBlog>> response) {
    if ((response.body()) != null) {
        infoBlog = response.body();
        java.util.Collections.reverse(infoBlog);
        onProgressUpdate(infoBlog);
    }
}
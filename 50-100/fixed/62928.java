@java.lang.Override
public void onResponse(retrofit2.Call<java.util.ArrayList<com.app.donteatalone.model.InfoBlog>> call, retrofit2.Response<java.util.ArrayList<com.app.donteatalone.model.InfoBlog>> response) {
    if ((response.body()) != null) {
        listBlog.clear();
        listBlog.addAll(response.body());
        java.util.Collections.reverse(listBlog);
        adapter.notifyDataSetChanged();
    }
}
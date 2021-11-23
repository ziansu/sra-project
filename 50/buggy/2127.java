@java.lang.Override
public java.lang.Boolean call(java.util.List<com.ladwa.aditya.offlinefirstapp.data.local.models.Post> posts) {
    android.util.Log.d("Repo", posts.get(0).getTitle());
    return posts != null;
}
@java.lang.Override
public void onFailure() {
    if ((progressBar) != null) {
        android.util.Log.e("ArticleActivity", "failed to load full content");
        progressBar.setVisibility(View.GONE);
    }
}
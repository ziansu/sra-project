@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d(com.example.xyzreader.ui.ArticleListActivity.TAG, "snack clicked!!!!!!!!");
    mIsRefreshing = true;
    refresh();
    updateRefreshingUI();
}
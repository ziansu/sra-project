@java.lang.Override
public void onShowFavorites(java.util.List<com.fireofandroid.bloggarden.StarredBlogDB.StarredBlog> favoriteBlogs) {
    android.util.Log.d(com.fireofandroid.bloggarden.favoriteblog.FavoritesActivity.TAG, ("onShowFavorites->total favorite blogs: " + (favoriteBlogs.size())));
    if ((favoriteBlogs.size()) == 0) {
        android.widget.Toast.makeText(this, "无收藏文章", Toast.LENGTH_SHORT).show();
    }
    mFavoriteBlogs = favoriteBlogs;
    mFavoritesGV.setAdapter(new com.fireofandroid.bloggarden.favoriteblog.FavoritesAdapter(getApplicationContext(), favoriteBlogs));
}
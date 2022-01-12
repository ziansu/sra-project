@android.databinding.BindingAdapter(value = "unreadFavoriteEntry")
public static void setUnreadIconFavorite(android.view.View view, java.lang.String url) {
    boolean isShow = jp.shts.android.keyakifeed.utils.PreferencesUtils.getBoolean(view.getContext(), jp.shts.android.keyakifeed.fragments.SettingsFragment.MARK_UNREAD_ARTICLES_ONLY_FAVORITE, false);
    if (isShow && (jp.shts.android.keyakifeed.providers.dao.UnreadArticles.exist(view.getContext(), url))) {
        view.setVisibility(View.VISIBLE);
    }else {
        view.setVisibility(View.GONE);
    }
}
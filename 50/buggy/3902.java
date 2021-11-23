@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(org.wordpress.android.ui.posts.services.PostEvents.PostMediaInfoUpdated event) {
    if ((isAdded()) && ((org.wordpress.android.WordPress.getCurrentBlog()) != null)) {
        getPostListAdapter().mediaUpdated(event.getMediaId(), event.getMediaUrl());
    }
}
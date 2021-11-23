@java.lang.SuppressWarnings(value = "unused")
public void onEventMainThread(org.wordpress.android.ui.posts.services.PostEvents.PostMediaInfoUpdated event) {
    if ((isAdded()) && ((getPostListAdapter()) != null)) {
        getPostListAdapter().mediaUpdated(event.getMediaId(), event.getMediaUrl());
    }
}
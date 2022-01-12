@java.lang.Override
public void onBookmarksLoaded(java.util.List<net.zionsoft.obadiah.model.domain.Bookmark> bookmarks, java.util.List<net.zionsoft.obadiah.model.domain.Verse> verses) {
    net.zionsoft.obadiah.ui.utils.AnimationHelper.fadeOut(loadingSpinner);
    net.zionsoft.obadiah.ui.utils.AnimationHelper.fadeIn(recyclerView);
    if ((bookmarks == null) || ((bookmarks.size()) == 0)) {
        empty.setVisibility(View.VISIBLE);
    }else {
        empty.setVisibility(View.GONE);
    }
    bookmarksListAdapter.setBookmarks(bookmarks, verses);
}
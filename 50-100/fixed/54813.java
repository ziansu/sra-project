@java.lang.Override
public void onResume() {
    super.onResume();
    if ((isInitialPage()) && ((((displayedPosts) != null) && ((displayedPosts.size()) == 0)) || ((displayedPosts) == null))) {
        showLoadingIndicator();
        loadPage(currentPage);
    }
}
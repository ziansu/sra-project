private void setTitle() {
    java.lang.String title = (codepath.com.nytimessearch.activities.SearchActivity.filter.isArts()) ? "Arts" : "".concat((codepath.com.nytimessearch.activities.SearchActivity.filter.isFashion() ? " Fashion" : "")).concat((codepath.com.nytimessearch.activities.SearchActivity.filter.isSports() ? " Sports" : "")).trim();
    if (!(android.text.TextUtils.isEmpty(title))) {
        getSupportActionBar().setTitle(title);
    }
}
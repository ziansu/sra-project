@java.lang.Override
protected void onPostCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
    loadFeeds(tabLayout.getTabAt(0).getText().toString());
}
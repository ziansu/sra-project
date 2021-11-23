@java.lang.Override
public void downloadComplete() {
    android.util.Log.d("Download", "Download complete");
    this.swap(3);
    this.soundListFragment.refreshList(this.soundCategories);
}
@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    if (((dy <= 0) && ((fab.getId()) != 0)) && (me.ccrama.redditslide.SettingValues.fab)) {
        fab.show();
    }else {
        fab.hide();
    }
}
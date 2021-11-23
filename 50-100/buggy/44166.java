@java.lang.Override
public void onCreateOptionsMenu(android.view.Menu menu, android.view.MenuInflater inflater) {
    super.onCreateOptionsMenu(menu, inflater);
    inflater.inflate(R.menu.fragment_thing_list, menu);
    android.view.MenuItem subtitleItem = menu.findItem(R.id.menu_item_show_subtitle);
    if ((mSubtitleVisible) && (subtitleItem != null)) {
        subtitleItem.setTitle(R.string.hide_subtitle);
    }else {
        subtitleItem.setTitle(R.string.show_subtitle);
    }
}
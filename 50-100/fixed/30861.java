@java.lang.Override
public boolean onPrepareOptionsMenu(final android.view.Menu menu) {
    menu.setGroupVisible(R.id.only_photos_options, (!(getAlbum().getCurrentMedia().isVideo())));
    if (customUri) {
        menu.setGroupVisible(R.id.on_internal_storage, false);
        menu.setGroupVisible(R.id.only_photos_options, false);
        menu.findItem(R.id.sort_action).setVisible(false);
    }
    return super.onPrepareOptionsMenu(menu);
}
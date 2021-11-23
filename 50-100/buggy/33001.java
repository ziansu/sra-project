@java.lang.Override
public void onDestroyActionMode(android.view.ActionMode mode) {
    android.content.Intent intent = new android.content.Intent();
    if (!(com.helpshift.support.util.ListUtils.isEmpty(mGridAdapter.getSelectedItems()))) {
        intent.putExtra(org.wordpress.android.ui.media.MediaGalleryPickerActivity.RESULT_IDS, org.wordpress.android.util.ListUtils.toLongArray(mGridAdapter.getSelectedItems()));
    }
    setResult(org.wordpress.android.ui.media.RESULT_OK, intent);
    finish();
}
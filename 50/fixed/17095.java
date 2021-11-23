@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if ((mColors) != null) {
        mColors.clear();
    }
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
    bindUi();
}
@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    mColors.clear();
    if ((mAdapter) != null) {
        mAdapter.notifyDataSetChanged();
    }
    bindUi();
}
@java.lang.Override
public void onCancel(android.content.DialogInterface dialog) {
    super.onCancel(dialog);
    com.android.gallery3d.filtershow.FilterShowActivity activity = ((com.android.gallery3d.filtershow.FilterShowActivity) (mContext));
    activity.cancelCurrentFilter();
    activity.leaveSeekBarPanel();
}
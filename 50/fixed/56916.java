@java.lang.Override
public void onClick(final android.content.DialogInterface dialog, final int which) {
    studentInfoList.remove(pos);
    notifyItemRangeRemoved(pos, 1);
}
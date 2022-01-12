@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String strName = arrayAdapterSort.getItem(which);
    meadSort(which, com.inspiredpanama.inspiredmead.MeadActivity.SORT_TYPE_DEC);
    mAdapter.notifyDataSetChanged();
}
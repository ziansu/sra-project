@java.lang.Override
public void onLoadFinished(android.content.Loader<android.database.Cursor> loader, android.database.Cursor data) {
    switch (loader.getId()) {
        case com.android.contacts.list.JoinContactListFragment.DISPLAY_NAME_LOADER :
            {
                if ((data != null) && (data.moveToFirst())) {
                    showTargetContactName(data.getString(0));
                }
                break;
            }
        case JoinContactListAdapter.PARTITION_ALL_CONTACTS :
            {
                if (data != null) {
                    final android.database.Cursor suggestionsCursor = ((com.android.contacts.list.JoinContactLoader.JoinContactLoaderResult) (data)).suggestionCursor;
                    onContactListLoaded(suggestionsCursor, data);
                }
                break;
            }
    }
}
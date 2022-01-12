@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    if (mFileList[which].isDirectory()) {
        loadFileList(mFileList[which]);
        builder.setItems(mFileNameList, this);
        builder.show();
    }else {
        mBookmarkManager.importBookmarksFromFile(mFileList[which], this);
    }
}
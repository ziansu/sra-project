@java.lang.Override
public void onItemClick(android.widget.AdapterView parent, android.view.View view, int position, long id) {
    if (position == 0) {
        return ;
    }
    java.lang.String strItem = mArFile.get(position);
    java.lang.String strPath = getAbsolutePath(strItem);
    java.lang.String[] fileList = getFileList(strPath);
    fileList2Array(fileList);
}
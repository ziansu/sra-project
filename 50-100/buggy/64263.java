@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.ovyou.clientunittest.data.FileItem fileItem = ((com.ovyou.clientunittest.data.FileItem) (mFileListAdapter.getItem(position)));
    java.lang.String fileName = fileItem.name;
    java.lang.String fileDir = (getApplicationContext().getExternalFilesDir(null)) + (java.io.File.separator);
    com.ovyou.clientunittest.server.ServerInterface.getInstance().downloadFile(fileName, fileDir, mFileDownloadEventListener);
}
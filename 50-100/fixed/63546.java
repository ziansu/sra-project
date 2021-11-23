@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> filesListView, android.view.View fileView, int filePosition, long fileId) {
    if (!(areFilesActionsAvailable())) {
        startFileOpening(getFile(filePosition));
        if (isDirectory(getFile(filePosition))) {
            setUpTitle(getFile(filePosition).getName());
        }
    }
}
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.mauriciotogneri.fileexplorer.models.FileInfo fileInfo = ((com.mauriciotogneri.fileexplorer.models.FileInfo) (parent.getItemAtPosition(position)));
    if (adapter.isSelectionMode()) {
        adapter.updateSelection(fileInfo.toggleSelection());
        updateButtonBar();
    }else {
        if (fileInfo.isDirectory()) {
            openFolder(fileInfo);
        }else {
            openFile(getContext(), fileInfo);
        }
    }
}
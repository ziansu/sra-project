protected void addTaskItem(android.content.Intent intent) {
    if (intent != null) {
        java.util.ArrayList<com.bbbbiu.biu.gui.transfer.FileItem> fileItems = intent.getParcelableArrayListExtra(com.bbbbiu.biu.gui.transfer.TransferBaseActivity.EXTRA_FILE_ITEM);
        if (fileItems != null) {
            mTransferAdapter.addItem(fileItems);
            onAddTaskItem(fileItems);
        }
    }
}
public void onShare() {
    java.util.List<com.mauriciotogneri.fileexplorer.utils.FileInfo> selectedItems = adapter.selectedItems(true);
    if ((selectedItems.size()) == 1) {
        shareSingle(selectedItems.get(0));
    }else {
        shareMultiple(selectedItems);
    }
}
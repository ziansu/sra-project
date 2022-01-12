@java.lang.Override
public void onOkClicked(android.support.v7.app.AlertDialog dialog, int selection) {
    _storageOptionsDialog.dismiss();
    java.lang.String newStorageId = storageDocuments.get(selection).getId();
    java.lang.String currentStorageId = document.get_storageId();
    if ((currentStorageId == null) || (!(currentStorageId.equals(newStorageId)))) {
        document.set_storageId(newStorageId);
        updateItemDocument(document);
    }
}
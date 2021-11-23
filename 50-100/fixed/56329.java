@java.lang.Override
public void onOkClicked(android.support.v7.app.AlertDialog dialog, int selection) {
    _statusChooserDialog.dismiss();
    java.lang.String currentStatusId = itemDocument.getItem_status_id();
    java.lang.String newStatusId = itemStatusDocuments.get(selection).getId();
    if ((currentStatusId == null) || (!(currentStatusId.equals(newStatusId)))) {
        itemDocument.setItem_status_id(newStatusId);
        saveItemDocument(itemDocument);
    }
}
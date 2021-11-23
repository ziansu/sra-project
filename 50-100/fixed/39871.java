public void buttonAddData(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, android.ohdm.de.ohdmviewer.ShowPolyObjectDataActivity.class);
    android.os.Bundle extras = new android.os.Bundle();
    extras.putSerializable(android.ohdm.de.ohdmviewer.MainActivity.MAP_DATA, polyObjectManager.getSelectedPolyObjectTags());
    extras.putSerializable(android.ohdm.de.ohdmviewer.MainActivity.EXTRA_SELECTED_POLYOBJECT_INTERNID, polyObjectManager.getSelectedPolyObjectInternId());
    intent.putExtras(extras);
    startActivityForResult(intent, android.ohdm.de.ohdmviewer.MainActivity.DATA_DIALOG_REQUEST_CODE);
}
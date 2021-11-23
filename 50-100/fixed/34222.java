private void updateMarkerInRealm(final com.task.vasskob.googlemapsrealm.model.Marker object) {
    realm.beginTransaction();
    object.setLabel(etLabel.getText().toString());
    if ((selectedImageBtn) != 0) {
        object.setIcon(manageReverseMarkerIcon(selectedImageBtn));
    }
    realm.commitTransaction();
    finish();
}
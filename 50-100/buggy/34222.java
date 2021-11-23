private void updateMarkerInRealm(final com.task.vasskob.googlemapsrealm.model.Marker object) {
    realm.beginTransaction();
    object.setLabel(etLabel.getText().toString());
    object.setIcon(manageReverseMarkerIcon(selectedImageBtn));
    realm.commitTransaction();
    finish();
}
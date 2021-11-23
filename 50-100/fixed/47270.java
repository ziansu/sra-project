@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    l = savedInstanceState.getParcelable("location");
    attachmentsToCreate = savedInstanceState.getParcelableArrayList("attachmentsToCreate");
    for (mil.nga.giat.mage.sdk.datastore.observation.Attachment a : attachmentsToCreate) {
        attachmentGallery.addAttachment(attachmentLayout, a);
    }
    android.widget.LinearLayout form = ((android.widget.LinearLayout) (findViewById(R.id.form)));
    mil.nga.giat.mage.form.LayoutBaker.populateLayoutFromBundle(form, ControlGenerationType.EDIT, savedInstanceState);
    currentMediaPath = savedInstanceState.getString(mil.nga.giat.mage.observation.ObservationEditActivity.CURRENT_MEDIA_PATH);
}
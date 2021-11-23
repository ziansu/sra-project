public void launchIncludeContactPicker(android.view.View view) {
    android.content.Intent intent = new android.content.Intent(this, com.mhmt.autoreplymate.activities.ContactPicker.class);
    if (edit) {
        intent.putExtra(com.mhmt.autoreplymate.activities.AddEditRule.outgoingExtraTag, includeString);
    }
    startActivityForResult(intent, com.mhmt.autoreplymate.activities.AddEditRule.PICK_INCLUDE_CONTACT_REQUEST);
}
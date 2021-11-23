private void editButtonPressed() {
    android.content.Intent intent = new android.content.Intent(getActivity(), termine24.secondinterviewtest.app.activities.EditActivity.class);
    intent.putExtra(Contact.EXTRA_CONTACT, ((android.os.Parcelable) (contact)));
    startActivityForResult(intent, Contact.REQUEST_EDIT_CONTACT);
}
private void saveAndBack() {
    com.example.vietnguyen.core.utils.MU.hideSofeKeyboard(activity);
    note.message = getEditText(R.id.edt_fragment_note_detail).getText().toString();
    note.date = new java.util.Date();
    note.save();
    activity.backOneFragment();
}
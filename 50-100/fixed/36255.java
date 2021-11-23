private void saveReminder() {
    ssdl.technion.ac.il.locationnotification.utilities.Reminder r = fUserDetails.saveReminder();
    if (null == r)
        return ;
    
    fMain.updateRecyclerView();
    editOff(null);
    android.widget.EditText etTitle = ((android.widget.EditText) (fUserDetails.getView().findViewById(R.id.et_edit_title)));
    android.view.inputmethod.InputMethodManager imm = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    imm.hideSoftInputFromWindow(etTitle.getWindowToken(), 0);
}
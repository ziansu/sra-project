private void addChip(java.lang.String communication) {
    if ((mNachoTextView) != null) {
        mNachoTextView.append(communication);
        int start = mNachoTextView.getText().toString().indexOf(communication);
        int last = mNachoTextView.getText().length();
        mNachoTextView.chipify(start, last);
    }else
        android.util.Log.e(mx.com.quiin.contactpicker.ui.ContactPickerFragment.TAG, "mNachoTextView is null");
    
}
@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.imageButton :
            android.content.Intent intent = new android.content.Intent(getApplicationContext(), com.byteshatf.callrecorder.contactpicker.ContactsPicker.class);
            intent.putExtra("pre_checked", mCheckedContacts);
            intent.putExtra("temporary_select", mShowTemporaryCheckedContacts);
            mCheckedContacts = null;
            startActivityForResult(intent, AppGlobals.REQUEST_CODE);
            break;
    }
}
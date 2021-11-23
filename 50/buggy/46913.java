@java.lang.Override
public void onClick(android.view.View v) {
    com.addressbook.thorrism.addressbook.DroidBook.getInstance().hideKeyboard(mCurrentEdit, getApplicationContext());
    mActivity.finish();
}
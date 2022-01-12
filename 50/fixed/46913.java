@java.lang.Override
public void onClick(android.view.View v) {
    com.addressbook.thorrism.addressbook.DroidBook.hideKeyboard(mCurrentEdit, getApplicationContext());
    mActivity.finish();
}
@java.lang.Override
public boolean finishInput() {
    java.lang.String result = null;
    if ((mContent.getText()) != null) {
        result = mContent.getText().toString();
    }
    if (android.text.TextUtils.isEmpty(result)) {
        android.widget.Toast.makeText(getActivity(), R.string.edit_empty_tip, Toast.LENGTH_SHORT).show();
        return false;
    }
    mQrcodeContent = result;
    return true;
}
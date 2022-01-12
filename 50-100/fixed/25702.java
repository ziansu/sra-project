@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.CharSequence input = mEditText.getText();
    if ((android.text.TextUtils.isEmpty(input)) && (hintIsValidEntry)) {
        input = mEditText.getHint();
    }
    java.lang.String value = null;
    if (input != null)
        value = input.toString().trim();
    
    mListener.onOk(value);
}
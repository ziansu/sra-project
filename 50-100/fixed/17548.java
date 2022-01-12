@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.String str = ("还能输入" + (remainTextLength)) + "个字";
    mTextLength.setText(str);
    if ((temp.length()) >= 10) {
        android.widget.Toast.makeText(mContext, getString(R.string.text_too_long), Toast.LENGTH_SHORT).show();
    }
}
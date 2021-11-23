@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    if (!(android.text.TextUtils.isEmpty(s))) {
        buttonMore.setVisibility(View.GONE);
        buttonSend.setVisibility(View.VISIBLE);
    }else {
        buttonMore.setVisibility(View.VISIBLE);
        buttonSend.setVisibility(View.GONE);
    }
}
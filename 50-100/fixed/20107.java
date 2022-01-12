@java.lang.Override
public void beforeTextChanged(java.lang.CharSequence s, int start, int count, int after) {
    if (((s.length()) > ((start + count) - 1)) && (((start + count) - 1) >= 0)) {
        if (after < count) {
            mStart = start;
            mModifiedText = s.subSequence((start + after), (start + count));
        }
    }
}
@java.lang.Override
public void onTextChanged(java.lang.CharSequence charSequence, int i, int i1, int i2) {
    if ((charSequence.toString().trim().length()) > 1) {
        e.onNext(charSequence.toString().trim());
    }
}
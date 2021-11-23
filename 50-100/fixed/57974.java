@java.lang.Override
public void onTextChanged(java.lang.CharSequence s, int start, int before, int count) {
    mRemoveButton.setVisibility(((s.length()) == 0 ? android.view.View.INVISIBLE : android.view.View.VISIBLE));
    if ((s.length()) >= 0) {
        mListener.onInputChanged(s.toString());
    }
}
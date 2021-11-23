@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    mListener.onModelChangedCallback(mCrime.getId().toString());
    returnResult();
}
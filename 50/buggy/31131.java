@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mCrime.setSolved(isChecked);
    mListener.onModelChangedCallback(mCrime.getId().toString());
    returnResult();
}
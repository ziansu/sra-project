private void changeSelection(android.widget.RadioButton radioButton, int position) {
    java.lang.CharSequence[] values = getEntryValues();
    if ((((radioButton != null) && ((mSelectedIndex) != position)) && (values != null)) && (position < (values.length))) {
        mSelectedIndex = position;
        radioButton.setChecked(true);
        callChangeListener(values[position]);
    }
}
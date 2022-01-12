public java.lang.String getSelectedFriend() {
    android.widget.RadioGroup r = ((android.widget.RadioGroup) (findViewById(R.id.friendsList)));
    android.widget.RadioButton b = ((android.widget.RadioButton) (findViewById(r.getCheckedRadioButtonId())));
    return b.getText().toString();
}
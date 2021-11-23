public java.lang.String getSelectedFriend() {
    android.widget.RadioGroup r = ((android.widget.RadioGroup) (findViewById(R.id.friendsList)));
    android.widget.RadioButton b = ((android.widget.RadioButton) (findViewById(r.getCheckedRadioButtonId())));
    if (b != null)
        return b.getText().toString().split("\t")[0];
    else
        return null;
    
}
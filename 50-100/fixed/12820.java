@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if ((com.cyapass.cyapass.MainActivity.currentSiteKey) == null) {
        return ;
    }
    if (isChecked) {
        com.cyapass.cyapass.MainActivity.currentSiteKey.setMaxLength(java.lang.Integer.parseInt(com.cyapass.cyapass.MainActivity.PlaceholderFragment.maxLengthTabEditText.getText().toString()));
    }else {
        com.cyapass.cyapass.MainActivity.currentSiteKey.setMaxLength(0);
    }
    if (gv.isLineSegmentComplete()) {
        android.util.Log.d("MainActivity", "addChars -- Re-generating password...");
        gv.GeneratePassword();
    }
}
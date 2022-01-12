@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked == true) {
        android.util.Log.e("isCheckedtr", ("" + isChecked));
        checkBox.setVisibility(View.VISIBLE);
    }else
        if (isChecked == false) {
            android.util.Log.e("visit", "visit");
            android.util.Log.e("isCheckedfal", ("" + isChecked));
            checkBox.setButtonDrawable(null);
        }
    
}
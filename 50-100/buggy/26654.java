public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (!isChecked) {
        editor.putInt("isActive", 0);
        statusText.setText("is Disabled");
        statusText.setTextColor(getResources().getColor(R.color.status_deactivated));
        editor.commit();
    }else {
        editor.putInt("isActive", 1);
        statusText.setText("is Enabled");
        statusText.setTextColor(getResources().getColor(R.color.status_activated));
        editor.commit();
    }
}
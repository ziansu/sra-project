public void setValueFromView() {
    if (((mMinutesView) != null) && (!(android.text.TextUtils.isEmpty(mMinutesView.getText())))) {
        setSettingsValue(("" + (((long) ((java.lang.Float.valueOf(mMinutesView.getText().toString())) * 60000)) + (java.lang.System.currentTimeMillis()))));
        mMinutesView.setText("");
    }
}
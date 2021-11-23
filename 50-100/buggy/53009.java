@org.androidannotations.annotations.Click(value = R.id.completeSilentSwitch)
void toggleCompleteSilent() {
    if (completeSilentSwitch.isChecked()) {
        android.util.Log.e("check", "ON");
        com.pawansinghchouhan05.callcustomizer.core.utils.Utils.savePreferences(getContext(), Constant.COMPLETE_SILENT, Constant.COMPLETE_SILENT_STATUS);
    }else {
        android.util.Log.e("check", "OFF");
        com.pawansinghchouhan05.callcustomizer.core.utils.Utils.savePreferences(getContext(), Constant.COMPLETE_SILENT, "");
    }
}
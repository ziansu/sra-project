@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    settingsListener.onInverseChecked(isChecked);
}
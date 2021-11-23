@butterknife.Optional
@butterknife.OnClick(value = R.id.debugSettings)
void onDebugSettings() {
    android.content.Intent intent = new android.content.Intent(this, debugSettingsClass);
    startActivity(intent);
}
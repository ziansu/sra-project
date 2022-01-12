@java.lang.Override
public void onDetach() {
    android.app.Activity act = getActivity();
    com.koroshiya.settings.SettingsManager.setBacklightAlwaysOn(act, false);
    com.koroshiya.settings.SettingsManager.setImmersiveMode(act, false);
    if ((cache) != null) {
        cache.close();
    }
    super.onDetach();
}
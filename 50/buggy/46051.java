@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    com.utama.madtodo.models.LocalRemoteTodo.setupPersistence(getActivity());
    if (key.equals("offlineMode")) {
        setupOfflineModePreferenceDependencies();
    }
}
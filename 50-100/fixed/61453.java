@java.lang.Override
public void handleMessage(android.os.Message msg) {
    final android.widget.ListView listView = mListReference.get();
    final android.preference.PreferenceScreen preferenceScreen = mPreferenceScreenReference.get();
    if ((listView != null) && (preferenceScreen != null)) {
        switch (msg.what) {
            case android.support.v4.preference.PreferenceFragment.MSG_BIND_PREFERENCES :
                android.support.v4.preference.PreferenceFragment.bindPreferences(preferenceScreen, listView);
                break;
        }
    }
}
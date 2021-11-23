@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    switch (key) {
        case "listthemas" :
            break;
        case "password" :
            break;
        case "listsync" :
            break;
        default :
            android.util.Log.d(TAG, ("Neregistrovana promena za podesavanje => " + key));
            break;
    }
}
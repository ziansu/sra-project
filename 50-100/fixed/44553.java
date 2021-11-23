@java.lang.Override
public void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
    if (Preferences.Keys.URL.equals(key))
        loadEndpointUrl();
    else
        if (((Preferences.Keys.TLS_CLIENT_CRT.equals(key)) || (Preferences.Keys.TLS_CLIENT_CRT_PASSWORD.equals(key))) || (Preferences.Keys.TLS_CA_CRT.equals(key)))
            loadHTTPClient();
        else
            if (Preferences.Keys.USERNAME.equals(key))
                org.owntracks.android.services.MessageProcessorEndpointHttp.headerUsername = org.owntracks.android.support.Preferences.getStringOrNull(Preferences.Keys.USERNAME);
            else
                if (Preferences.Keys.DEVICE_ID.equals(key))
                    org.owntracks.android.services.MessageProcessorEndpointHttp.headerDevice = org.owntracks.android.support.Preferences.getStringOrNull(Preferences.Keys.DEVICE_ID);
                
            
        
    
}
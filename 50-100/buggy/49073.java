private android.content.Intent parseDeepLink(java.lang.String deepLink) {
    if ("preferences".equals(deepLink)) {
        return new android.content.Intent(getApplicationContext(), com.urbanairship.push.sample.preference.PreferencesActivity.class);
    }else
        if ("home".equals(deepLink)) {
            return new android.content.Intent(getApplicationContext(), com.urbanairship.push.sample.MainActivity.class);
        }else
            if ("location".equals(deepLink)) {
                return new android.content.Intent(getApplicationContext(), com.urbanairship.push.sample.LocationActivity.class);
            }else {
                return null;
            }
        
    
}
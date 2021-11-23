private android.content.Intent parseDeepLink(java.lang.String deepLink) {
    switch (deepLink) {
        case "preferences" :
            return new android.content.Intent(getApplicationContext(), com.urbanairship.push.sample.preference.PreferencesActivity.class);
        case "home" :
            return new android.content.Intent(getApplicationContext(), com.urbanairship.push.sample.MainActivity.class);
        case "location" :
            return new android.content.Intent(getApplicationContext(), com.urbanairship.push.sample.LocationActivity.class);
        default :
            return null;
    }
}
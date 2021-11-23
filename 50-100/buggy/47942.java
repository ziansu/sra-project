java.lang.String getDistance() {
    java.lang.String str = settingPref.getString("Distance", "0");
    android.util.Log.i("getDistance()", Distance);
    int pos = str.indexOf(" ");
    if (pos != (-1)) {
        return str.substring(0, pos);
    }
    return str;
}
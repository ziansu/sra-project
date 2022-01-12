int appExists(java.lang.String name) {
    for (int i = 0; (statArray[i]) != null; ++i) {
        if (statArray[i].packageName.equals(name)) {
            android.util.Log.d("Crash site", java.lang.String.valueOf(i));
            return i;
        }
    }
    return -1;
}
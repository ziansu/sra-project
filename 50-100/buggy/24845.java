public void putListDouble(java.lang.String key, java.util.ArrayList<java.lang.Double> doubleList) {
    checkForNullKey(key);
    java.lang.Double[] myDoubleList = doubleList.toArray(new java.lang.Double[doubleList.size()]);
    preferences.edit().putString(key, android.text.TextUtils.join("‚‗‚", myDoubleList)).apply();
}
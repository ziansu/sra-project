public void putListDouble(java.lang.String key, java.util.ArrayList<java.lang.Double> doubleList) {
    if (key == null)
        return ;
    
    java.lang.Double[] myDoubleList = doubleList.toArray(new java.lang.Double[doubleList.size()]);
    preferences.edit().putString(key, android.text.TextUtils.join("‚‗‚", myDoubleList)).apply();
}
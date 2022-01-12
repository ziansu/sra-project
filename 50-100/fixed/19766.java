public void putListInt(java.lang.String key, java.util.ArrayList<java.lang.Integer> intList) {
    if (key == null)
        return ;
    
    if (intList == null)
        return ;
    
    java.lang.Integer[] myIntList = intList.toArray(new java.lang.Integer[intList.size()]);
    preferences.edit().putString(key, android.text.TextUtils.join("‚‗‚", myIntList)).apply();
}
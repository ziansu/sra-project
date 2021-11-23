public void putListString(java.lang.String key, java.util.ArrayList<java.lang.String> stringList) {
    if (key == null)
        return ;
    
    if (stringList == null)
        return ;
    
    java.lang.String[] myStringList = stringList.toArray(new java.lang.String[stringList.size()]);
    preferences.edit().putString(key, android.text.TextUtils.join("‚‗‚", myStringList)).apply();
}
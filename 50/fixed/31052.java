public java.lang.String getPreferences(java.lang.String Name) {
    java.lang.String o;
    settings = getSharedPreferences(Name, 0);
    o = settings.getString(Name, null);
    return o;
}
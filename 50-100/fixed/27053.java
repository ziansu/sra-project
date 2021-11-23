public void setIntValue(java.lang.String key, int value) {
    boolean result = this.sharedPreferences.edit().putString(key, java.lang.Integer.toString(value)).commit();
    if (result == false) {
        throw new java.lang.RuntimeException((("Failure during saving int value with key '" + key) + "'"));
    }
}
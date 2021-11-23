public int getIntValue(java.lang.String key, int defValue) {
    java.lang.String stringValue = this.sharedPreferences.getString(key, java.lang.Integer.toString(defValue));
    int integerValue = java.lang.Integer.parseInt(stringValue);
    return integerValue;
}
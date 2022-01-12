public void putListBoolean(java.lang.String key, java.util.ArrayList<java.lang.Boolean> boolList) {
    checkForNullKey(key);
    java.util.ArrayList<java.lang.String> newList = new java.util.ArrayList<java.lang.String>();
    for (java.lang.Boolean item : boolList) {
        if (item) {
            newList.add("true");
        }else {
            newList.add("false");
        }
    }
    putListString(key, newList);
}
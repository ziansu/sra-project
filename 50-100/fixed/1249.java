public void putListBoolean(java.lang.String key, java.util.ArrayList<java.lang.Boolean> boolList) {
    if (key == null)
        return ;
    
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
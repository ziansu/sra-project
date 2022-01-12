private void putData(java.lang.String key, java.lang.String value) {
    if (joinData.containsKey(key)) {
        joinData.get(key).add(value);
    }else {
        java.util.List<java.lang.String> tmpList = new java.util.ArrayList<java.lang.String>();
        tmpList.add(value);
        joinData.put(key, tmpList);
    }
}
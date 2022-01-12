private void putData(java.lang.String key, java.lang.String value, java.util.Map<java.lang.String, java.util.List<java.lang.String>> target) {
    if (target.containsKey(key)) {
        target.get(key).add(value);
    }else {
        java.util.List<java.lang.String> tmpList = new java.util.ArrayList<java.lang.String>();
        tmpList.add(value);
        target.put(key, tmpList);
    }
}
private static void incrementDictCount(java.util.HashMap<java.lang.String, java.lang.Integer> hashMap, java.lang.String key) {
    if ((key.length()) < 2) {
        return ;
    }
    if (hashMap.containsKey(key)) {
        int count = hashMap.get(key);
        hashMap.put(key, (count + 1));
    }else {
        hashMap.put(key, 1);
    }
}
public void set(java.lang.String s, java.lang.Object o) {
    if (o == null) {
        java.util.ArrayList<java.lang.String> remv = new java.util.ArrayList<>();
        remv.add(s);
        for (java.lang.String key : map.keySet()) {
            if (key.startsWith(s)) {
                remv.add(key);
            }
        }
        for (java.lang.String st : remv) {
            map.remove(st);
        }
    }
    map.put(s, o);
}
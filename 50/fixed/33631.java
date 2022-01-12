private T insertWithId(T t, java.lang.String key) {
    t.setId(key);
    firebase.child(key).setValue(t);
    map.put(key, t);
    return t;
}
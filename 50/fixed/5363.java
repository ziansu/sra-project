private void record(java.lang.String name, java.lang.Integer value) {
    if (value != null) {
        map.put(name, (value + 1));
    }else {
        map.put(name, 1);
    }
}
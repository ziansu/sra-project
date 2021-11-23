public void put(java.lang.String key, java.lang.String value) {
    create.put(key, value);
    if ((java.lang.Math.random()) < (limit)) {
        db.commit();
    }
}
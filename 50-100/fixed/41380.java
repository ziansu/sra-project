public java.lang.Object[] getDistinctDesignatorValues(java.lang.String key) {
    com.mongodb.DBCollection coll = getDatabase().getCollection("logged_designators");
    java.util.List<?> l = coll.distinct(key);
    java.lang.Object[] out = new java.lang.Object[l.size()];
    int index = 0;
    for (java.lang.Object v : l) {
        out[index] = v;
        index += 1;
    }
    return out;
}
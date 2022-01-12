public java.lang.String[] getDistinctDesignatorValues(java.lang.String key) {
    com.mongodb.DBCollection coll = getDatabase().getCollection("logged_designators");
    java.util.List<?> l = coll.distinct(key);
    java.lang.String[] out = new java.lang.String[l.size()];
    int index = 0;
    for (java.lang.Object v : l) {
        out[index] = v.toString();
        index += 1;
    }
    return out;
}
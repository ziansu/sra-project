protected org.bson.BasicBSONObject addEntry(java.lang.Object[] key) {
    org.bson.types.BasicBSONList lst = ((org.bson.types.BasicBSONList) (model.unencrypted.get("e")));
    org.bson.BasicBSONObject entry = new org.bson.BasicBSONObject();
    org.bson.types.BasicBSONList idxkey = new org.bson.types.BasicBSONList();
    entry.put("k", idxkey);
    for (java.lang.Object o : key)
        idxkey.add(o);
    
    lst.add(entry);
    return entry;
}
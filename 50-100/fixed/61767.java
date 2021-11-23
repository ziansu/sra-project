public java.lang.String pkAsConcatString() {
    if (pkColumns.isEmpty()) {
        return (database) + (table);
    }
    java.lang.String keys = "";
    for (java.lang.String pk : pkColumns) {
        java.lang.Object pkValue = null;
        pk = pk.toLowerCase();
        if (data.containsKey(pk))
            pkValue = data.get(pk);
        
        if (pkValue != null)
            keys += pkValue.toString();
        
    }
    if (keys.isEmpty())
        return "None";
    
    return keys;
}
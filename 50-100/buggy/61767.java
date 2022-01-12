public java.lang.String pkAsConcatString() {
    if (pkColumns.isEmpty()) {
        return (database) + (table);
    }
    java.lang.String keys = "";
    for (java.lang.String pk : pkColumns) {
        java.lang.Object pkValue = null;
        if (data.containsKey(pk.toLowerCase()))
            pkValue = data.get(pk);
        
        if (pkValue != null)
            keys += pkValue.toString();
        
    }
    if (keys.isEmpty())
        return "None";
    
    return keys;
}
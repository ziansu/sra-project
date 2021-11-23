protected static org.json.JSONObject recursiveCopyJSONObject(org.json.JSONObject record) throws org.json.JSONException {
    java.lang.String[] keys = org.json.JSONObject.getNames(record);
    org.json.JSONObject copy = new org.json.JSONObject();
    if (keys != null)
        for (java.lang.String key : org.json.JSONObject.getNames(record))
            copy.put(key, edu.umass.cs.gnsserver.database.DiskMapRecords.recursiveCopyObject(record.get(key)));
        
    
    return copy;
}
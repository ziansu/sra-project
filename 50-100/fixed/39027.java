@java.lang.SuppressWarnings(value = "unchecked")
public org.json.simple.JSONObject getReturnStructureJSON(fi.bilot.pojo.Flight flight) {
    com.sap.conn.jco.JCoStructure returnStructure = flight.getReturnStructure();
    com.sap.conn.jco.JCoMetaData meta = returnStructure.getMetaData();
    org.json.simple.JSONObject obj = new org.json.simple.JSONObject();
    for (int i = 0; i < (returnStructure.getFieldCount()); i++) {
        obj.put(meta.getName(i), returnStructure.getString(i));
    }
    return obj;
}
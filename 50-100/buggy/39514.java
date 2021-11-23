public void toJsonArrayFromStruct(java.sql.Array data, org.simplity.json.JSONWriter writer) throws java.sql.SQLException, org.simplity.json.JSONException {
    if (data == null) {
        writer.value(null);
        return ;
    }
    writer.array();
    for (java.lang.Object struct : ((java.lang.Object[]) (data.getArray()))) {
        this.toJsonObjectFromStruct(((java.sql.Struct) (struct)), writer);
    }
    writer.endArray();
}
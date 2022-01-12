public void toJsonArrayFromStruct(java.lang.Object[] array, org.simplity.json.JSONWriter writer) throws java.sql.SQLException, org.simplity.json.JSONException {
    if (array == null) {
        writer.value(null);
        return ;
    }
    writer.array();
    for (java.lang.Object struct : array) {
        this.toJsonObjectFromStruct(((java.sql.Struct) (struct)), writer);
    }
    writer.endArray();
}
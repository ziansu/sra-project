@java.lang.Override
public void afterInsert(db.NameValuePairs name_value_pairs, int row_id, db.Request request) {
    if ((name_value_pairs.getBoolean("active")) && (name_value_pairs.getBoolean("calendar")))
        addModule(name_value_pairs.getString("name"), row_id, request);
    
    super.afterInsert(name_value_pairs, row_id, request);
}
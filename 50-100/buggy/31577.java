@java.lang.Override
public void update() throws java.sql.SQLException {
    java.lang.String query = java.lang.String.format("UPDATE %s SET %s=?, %s=? WHERE %s =?", "event", "event_date", eventDate, "name", name, "id", id);
    java.util.ArrayList<creators.ParamSQL> aLP = new java.util.ArrayList<creators.ParamSQL>();
    aLP.add(new creators.ParamSQL(creators.SQLConstants.SQL_TYPE_DATE, eventDate));
    aLP.add(new creators.ParamSQL(creators.SQLConstants.SQL_TYPE_STRING, name));
    aLP.add(new creators.ParamSQL(creators.SQLConstants.SQL_TYPE_INT, id));
    int ret = servlets.Query.executeStatement(query, aLP);
}
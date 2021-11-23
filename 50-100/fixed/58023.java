public int executeUpdate(final java.lang.String sql) throws java.sql.SQLException {
    query = new com.orientechnologies.orient.core.sql.OCommandSQL(sql);
    rawResult = database.command(query).execute();
    if ((rawResult) instanceof com.orientechnologies.orient.core.record.impl.ODocument)
        return 1;
    else
        if ((rawResult) instanceof java.lang.Integer)
            return ((java.lang.Integer) (rawResult));
        else
            if ((rawResult) instanceof java.util.Collection)
                return ((java.util.Collection) (rawResult)).size();
            
        
    
    return 0;
}
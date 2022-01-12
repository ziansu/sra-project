public java.util.List<sample.AlcoholData> searchAlcoholByDate(java.sql.Date date, java.lang.String BEFORE_OR_AFTER) throws java.sql.SQLException {
    java.lang.String query = "";
    if (BEFORE_OR_AFTER.equals("AFTER")) {
        query = ("SELECT * FROM ALCOHOL WHERE '" + date) + "' >= ALCOHOL.DATE_APPROVED";
    }else
        if (BEFORE_OR_AFTER.equals("BEFORE")) {
            query = ("SELECT * FROM ALCOHOL WHERE '" + date) + "' <= ALCOHOL.DATE_APPROVED";
        }
    
    return searchAlcoholTable(query);
}
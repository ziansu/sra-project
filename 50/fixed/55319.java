public java.util.List<sample.AlcoholData> searchAlcoholWithID(int number) throws java.sql.SQLException {
    java.lang.String query = "SELECT * FROM ALCOHOL WHERE ALCOHOL.AID = " + number;
    return searchAlcoholTable(query);
}
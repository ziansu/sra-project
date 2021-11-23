@org.junit.Test
public void multipleParamsQueryTest() throws java.sql.SQLException {
    try (java.sql.ResultSet rs = runSafeQuery(("SELECT Name From celebs_arrests WHERE Reason LIKE CONCAT('%',?,'%')" + "AND YEAR(Arrest_Date) = ? ORDER BY Name"), new java.lang.Object[]{ "drunk driving" , 2014 })) {
        if (rs.next())
            org.junit.Assert.assertEquals("Flavor Flav", rs.getString(1));
        
        if (rs.next())
            org.junit.Assert.assertEquals("Justin Bieber", rs.getString(1));
        
    } catch (java.sql.SQLException ¢) {
        throw ¢;
    }
}
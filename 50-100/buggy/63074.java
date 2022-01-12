@org.junit.Test
public void getDriver() {
    try {
        java.sql.Driver driver = java.sql.DriverManager.getDriver(io.perbone.jejdbc.jdbc.DriverTest.URL_SAMPLE);
        org.junit.Assert.assertNotNull(driver);
        org.junit.Assert.assertTrue(driver.getClass().equals(java.sql.Driver.class));
    } catch (java.sql.SQLException e) {
        org.junit.Assert.fail(e.getMessage());
    }
    java.sql.Driver driver = null;
    try {
        driver = java.sql.DriverManager.getDriver(io.perbone.jejdbc.jdbc.DriverTest.URL_SAMPLE_WRONG);
    } catch (java.sql.SQLException e) {
        org.junit.Assert.assertNull(driver);
    }
}
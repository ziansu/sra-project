@org.junit.Test
public void testConnect() {
    try {
        java.sql.Connection connection = getConnection();
        assert connection != null;
    } catch (final java.lang.Exception e) {
        org.junit.Assert.fail(e.getMessage());
    }
}
@org.junit.Test
public void connectionTest() throws java.lang.Exception {
    infoeval.main.WikiData.Connector conn = new infoeval.main.WikiData.Connector();
    assertNotNull(conn.getConnection());
}
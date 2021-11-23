@org.junit.Ignore
@org.junit.Test
public void fillTableSizeTest() throws java.lang.Exception {
    infoeval.main.WikiData.Connector conn = new infoeval.main.WikiData.Connector();
    assert (conn.getConnection()) != null;
    java.sql.ResultSet rs = conn.runQuery("SELECT COUNT(*) FROM basic_info");
    int size = rs.getInt(1);
    infoeval.main.WikiData.Extractor ext = new infoeval.main.WikiData.Extractor();
    ext.executeQuery();
    int dbpediaResultsSize = ext.getResults().size();
    assertEquals(dbpediaResultsSize, size);
    assertEquals(10000, size);
    conn.closeConnection();
}
@org.junit.Test
public void testInetAton() throws java.lang.Exception {
    final java.lang.String query = "select inet_aton( '192.168.0.1') as inet from (values(1))";
    testBuilder().sqlQuery(query).ordered().baselineColumns("inet").baselineValues("3232235521").go();
}
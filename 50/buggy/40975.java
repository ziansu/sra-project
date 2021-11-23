@org.junit.Test
public void chekGetAllRowsWithNullParam() {
    org.keedio.flume.source.SQLSourceHelper sqlSourceHelper = new org.keedio.flume.source.SQLSourceHelper(context);
    assertEquals(null, sqlSourceHelper.getAllRows(null));
}
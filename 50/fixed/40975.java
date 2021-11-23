@org.junit.Test
public void chekGetAllRowsWithNullParam() {
    org.keedio.flume.source.SQLSourceHelper sqlSourceHelper = new org.keedio.flume.source.SQLSourceHelper(context);
    assertEquals(new java.util.ArrayList<java.lang.String>(), sqlSourceHelper.getAllRows(null));
}
@org.junit.Test
public void testDeleteColumnDeletesColumn() {
    com.buabook.kdb.data.KdbTable table = new com.buabook.kdb.data.KdbTable("my-test-table");
    table.setInitialDataSet(getTable());
    table.deleteColumn("key1");
    org.junit.Assert.assertThat(table.getTableData(), not(hasKey("key1")));
}
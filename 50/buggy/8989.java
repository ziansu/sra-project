@org.junit.Test
public void testConstructorExecutesOkIfTableNameSpecified() {
    com.buabook.kdb.data.KdbTable table = new com.buabook.kdb.data.KdbTable("my-test-table");
    org.junit.Assert.assertThat(table, org.hamcrest.Matchers.is(org.hamcrest.Matchers.not(org.hamcrest.Matchers.nullValue())));
}
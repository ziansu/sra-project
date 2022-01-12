@org.junit.Test
public void testTimestampDeSerializeWithNanoseconds() throws java.lang.Exception {
    org.apache.hadoop.io.Writable w = new org.apache.hadoop.io.Text("{\"one\":true,\"five\":\"2013-03-27 23:18:40.123456\"}");
    org.openx.data.jsonserde.json.JSONObject result = ((org.openx.data.jsonserde.json.JSONObject) (org.openx.data.jsonserde.JsonSerDeTimeStampTest.instance.deserialize(w)));
    org.junit.Assert.assertEquals(java.sql.Timestamp.valueOf("2013-03-27 23:18:40.123456"), result.get("five"));
}
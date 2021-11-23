@org.junit.Test
public void testDefaultJsonToCSV() throws java.lang.Exception {
    final java.util.Map<java.lang.String, java.lang.Object> data = new java.util.LinkedHashMap<>();
    data.put("type", "default");
    data.put("origin", "person");
    data.put("value", "-2");
    final java.lang.String csv = adapter.jsonToCsv("gxl_agehh_hhleader_1", data, schema);
    assertEquals("gxl_agehh_hhleader_1,P,n,string,gxl_agehh_hhleader_1,,-2", csv);
}
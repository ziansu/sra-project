@org.junit.Test
public void testGetProjectedSchema3() throws java.lang.Exception {
    org.apache.parquet.schema.MessageType originalMsg = org.apache.parquet.schema.MessageTypeParser.parseMessageType(("message hive_schema {\n" + ((((("  optional group structCol {\n" + "    optional int32 a;\n") + "    optional double b;\n") + "  }\n") + "  optional boolean c;\n") + "}\n")));
    org.apache.hadoop.hive.ql.io.parquet.HiveParquetSchemaTestUtils.testConversion("structCol,c", "struct<b:double>,boolean", org.apache.hadoop.hive.ql.io.parquet.read.DataWritableReadSupport.getProjectedSchema(originalMsg, java.util.Arrays.asList("structCol", "c"), java.util.Arrays.asList(0, 1), java.util.Arrays.asList("structCol.b", "c")).toString());
}
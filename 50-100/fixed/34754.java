@org.junit.Test
public void testGetProjectedSchema1() throws java.lang.Exception {
    org.apache.parquet.schema.MessageType originalMsg = org.apache.parquet.schema.MessageTypeParser.parseMessageType(("message hive_schema {\n" + (((((("  optional group structCol {\n" + "    optional int32 a;\n") + "    optional double b;\n") + "    optional boolean c;\n") + "    optional fixed_len_byte_array(3) d (DECIMAL(5,2));\n") + "  }\n") + "}\n")));
    org.apache.hadoop.hive.ql.io.parquet.HiveParquetSchemaTestUtils.testConversion("structCol", "struct<a:int>", org.apache.hadoop.hive.ql.io.parquet.read.DataWritableReadSupport.getProjectedSchema(originalMsg, java.util.Arrays.asList("structCol"), java.util.Arrays.asList(0), new java.util.HashSet<>(java.util.Arrays.asList("structCol.a"))).toString());
}
@org.junit.Test
public void testGetProjectedSchema2() throws java.lang.Exception {
    org.apache.parquet.schema.MessageType originalMsg = org.apache.parquet.schema.MessageTypeParser.parseMessageType(("message hive_schema {\n" + (((("  optional group structCol {\n" + "    optional int32 a;\n") + "    optional double b;\n") + "  }\n") + "}\n")));
    org.apache.hadoop.hive.ql.io.parquet.HiveParquetSchemaTestUtils.testConversion("structCol", "struct<a:int,b:double>", org.apache.hadoop.hive.ql.io.parquet.read.DataWritableReadSupport.getProjectedSchema(originalMsg, java.util.Arrays.asList("structCol"), java.util.Arrays.asList(0), java.util.Arrays.asList("structCol.a", "structCol.b")).toString());
}
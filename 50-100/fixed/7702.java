public boolean convert() {
    java.lang.String[] otherArgs = new java.lang.String[]{ getAvroHDFSDest() , getParquetHDFSDest() };
    boolean success = false;
    try {
        org.apache.hadoop.util.ToolRunner.run(this, otherArgs);
        success = true;
    } catch (java.lang.Exception e) {
        fr.finaxys.tutorials.utils.parquet.AvroParquetConverter.LOGGER.log(java.util.logging.Level.SEVERE, "Can't run map reduce job", e);
    }
    return success;
}
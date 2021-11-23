@java.lang.Override
protected java.util.Map<java.lang.String, java.lang.String> getAdditionalPFSArguments() {
    java.util.Map<java.lang.String, java.lang.String> args = new java.util.HashMap<>();
    args.put(((co.cask.cdap.api.dataset.lib.FileSetProperties.OUTPUT_PROPERTIES_PREFIX) + "parquet.avro.schema"), config.schema);
    return args;
}
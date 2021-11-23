private void validate() {
    if ((!(containsMacro(format))) && (!(co.cask.hydrator.plugin.spark.FileStreamingSource.Conf.FORMATS.contains(format)))) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Invalid format '%s'. Must be one of %s", format, com.google.common.base.Joiner.on(',').join(co.cask.hydrator.plugin.spark.FileStreamingSource.Conf.FORMATS)));
    }
    getSchema();
}
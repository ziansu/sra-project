@java.lang.Override
public void cleanup() {
    super.cleanup();
    this.getRepresentationHandler().uncacheAll();
    org.apache.spark.sql.hive.HiveContext hiveContext = ((io.ddf.spark.SparkDDFManager) (this.getManager())).getHiveContext();
    if ((!(org.python.google.common.base.Strings.isNullOrEmpty(this.getTableName()))) && (this.isTable())) {
        hiveContext.dropTempTable(this.getTableName());
    }
}
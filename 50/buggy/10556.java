@java.lang.Override
public com.microsoft.azure.management.sql.implementation.SqlDatabaseImpl withoutElasticPool() {
    this.inner().withElasticPoolName("");
    return this;
}
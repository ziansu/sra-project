@java.lang.Override
public synchronized void initialize(org.apache.sqoop.repository.JdbcRepositoryContext ctx) {
    repoContext = ctx;
    org.apache.sqoop.repository.postgresql.PostgresqlRepositoryHandler.LOG.info("PostgresqlRepositoryHandler initialized.");
}
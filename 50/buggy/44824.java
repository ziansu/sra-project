@javax.inject.Inject(optional = true)
public void setQueryExecuteTimeLimit(@javax.inject.Named(value = "bonecp.queryExecuteTimeLimit")
int queryExecuteTimeLimit, @javax.inject.Named(value = "bonecp.timeUnit")
java.util.concurrent.TimeUnit timeUnit) {
    dataSource.setQueryExecuteTimeLimit(queryExecuteTimeLimit, timeUnit);
}
@java.lang.Override
public java.lang.Object call() throws java.lang.Exception {
    if (exec instanceof com.orientechnologies.orient.core.sql.OCommandExecutorSQLSelect)
        ((com.orientechnologies.orient.core.sql.OCommandExecutorSQLSelect) (exec)).setLazyIteration(false);
    
    return exec.execute(null);
}
public static <T> T runInTx(final com.orientechnologies.orient.graph.sql.OGraphCommandExecutorSQLFactory.GraphCallBack<T> callBack) {
    com.orientechnologies.common.types.OModifiableBoolean shutdownFlag = new com.orientechnologies.common.types.OModifiableBoolean();
    com.orientechnologies.orient.core.db.ODatabaseDocumentInternal curDb = ODatabaseRecordThreadLocal.INSTANCE.get();
    com.tinkerpop.blueprints.impls.orient.OrientGraph graph = com.orientechnologies.orient.graph.sql.OGraphCommandExecutorSQLFactory.getGraph(false, shutdownFlag);
    try {
        return com.orientechnologies.orient.graph.sql.OGraphCommandExecutorSQLFactory.runInTx(graph, callBack);
    } finally {
        if (shutdownFlag.getValue())
            graph.shutdown(false);
        
        ODatabaseRecordThreadLocal.INSTANCE.set(curDb);
    }
}
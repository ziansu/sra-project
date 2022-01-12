@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void stopTransaction(final com.tinkerpop.blueprints.impls.orient.Conclusion conclusion) {
    final com.tinkerpop.blueprints.impls.orient.OrientGraphContext context = getContext(false);
    if (context == null)
        return ;
    
    if (((context.rawGraph.isClosed()) || ((context.rawGraph.getTransaction()) instanceof com.orientechnologies.orient.core.tx.OTransactionNoTx)) || ((context.rawGraph.getTransaction().getStatus()) != (com.orientechnologies.orient.core.tx.OTransaction.TXSTATUS.BEGUN)))
        return ;
    
    if ((Conclusion.SUCCESS) == conclusion)
        commit();
    else
        rollback();
    
}
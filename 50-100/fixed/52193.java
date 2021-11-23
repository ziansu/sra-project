@java.lang.Override
protected void doInTransactionWithoutResult(org.springframework.transaction.TransactionStatus status) {
    final java.lang.String cacheKey = pipelineLockStateCacheKey(pipelineName);
    com.thoughtworks.go.server.dao.PipelineState state = pipelineStateFor(pipelineName);
    if (state == null) {
        state = new com.thoughtworks.go.server.dao.PipelineState(pipelineName);
    }
    clearLockedPipelineStateCache(pipelineName);
    state.unlock();
    sessionFactory.getCurrentSession().saveOrUpdate(state);
}
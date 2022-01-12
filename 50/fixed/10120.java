@java.lang.Override
public boolean getMoreResults() throws java.sql.SQLException {
    com.alibaba.druid.filter.FilterChainImpl chain = createChain();
    boolean value = chain.statement_getMoreResults(this);
    updateCount = null;
    recycleFilterChain(chain);
    return value;
}
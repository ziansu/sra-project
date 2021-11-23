@java.lang.Override
public void setMaxPool(final int maxPool) {
    m_pool.setMinPoolSize(maxPool);
    m_pool.setMaxPoolSize(maxPool);
}
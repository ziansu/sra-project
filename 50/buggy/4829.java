public void batchDelete(java.util.List<org.candlepin.model.Pool> pools) {
    for (org.candlepin.model.Pool pool : pools) {
        currentSession().delete(pool);
        pool.getEntitlements().clear();
    }
}
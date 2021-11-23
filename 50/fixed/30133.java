private void load() {
    stormstock.fw.tranbase.account.AccountStore.StoreEntity cStoreEntity = m_accountStore.load();
    if (null != cStoreEntity) {
        m_stockSelectList.clear();
        if (null != (cStoreEntity.stockSelectList))
            m_stockSelectList.addAll(cStoreEntity.stockSelectList);
        
    }
}
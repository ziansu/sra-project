@org.springframework.transaction.annotation.Transactional
public com.softserve.if072.common.model.Store getStoreByNameAndUser(java.lang.String StoreName, java.lang.String storeAddress, int userId) {
    com.softserve.if072.common.model.Store store = storeDAO.getByName(StoreName, storeAddress, userId);
    if (store != null) {
        return store;
    }else
        return null;
    
}
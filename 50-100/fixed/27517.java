@org.springframework.transaction.annotation.Transactional
public void addStore(com.softserve.if072.common.model.Store store) throws java.lang.IllegalArgumentException {
    if ((store != null) && (!("".equals(store.getName())))) {
        storeDAO.insert(store);
    }else
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Illegal arguments in store id %d", store.getId()));
    
}
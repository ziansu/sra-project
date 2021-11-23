@org.springframework.transaction.annotation.Transactional
public void addStore(com.softserve.if072.common.model.Store store) throws java.lang.IllegalArgumentException {
    if (((store != null) && ((store.getName()) != null)) && (!(store.getName().equals("")))) {
        storeDAO.insert(store);
    }else
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Illegal arguments in store id %d", store.getId()));
    
}
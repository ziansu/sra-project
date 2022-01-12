public boolean alreadyExist(com.softserve.if072.common.model.Store store, com.softserve.if072.common.model.User user) {
    com.softserve.if072.common.model.Store existStore = getStoreByNameAndUserId(store, user);
    if ((existStore != null) && (existStore.isEnabled())) {
        return (store.getId()) != (existStore.getId());
    }else {
        return false;
    }
}
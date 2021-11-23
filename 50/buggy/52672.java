static synchronized uk.ac.manchester.cs.mekon.store.IStore get(uk.ac.manchester.cs.mekon.store.CModel model) {
    uk.ac.manchester.cs.mekon.store.IStore store = uk.ac.manchester.cs.mekon.store.StoreRegister.stores.get(model);
    if (store != null) {
        throw new uk.ac.manchester.cs.mekon.store.KAccessException("Store has not been created for model!");
    }
    return store;
}
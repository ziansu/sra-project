private com.sonicle.webtop.core.sdk.UserProfileId storeToOwner(int storeId) {
    synchronized(cacheOwnerByStore) {
        if (cacheOwnerByStore.containsKey(storeId)) {
            return cacheOwnerByStore.get(storeId);
        }else {
            try {
                com.sonicle.webtop.core.sdk.UserProfileId owner = findStoreOwner(storeId);
                cacheOwnerByStore.put(storeId, owner);
                return owner;
            } catch (com.sonicle.webtop.core.sdk.WTException ex) {
                throw new com.sonicle.webtop.core.sdk.WTRuntimeException(ex.getMessage());
            }
        }
    }
}
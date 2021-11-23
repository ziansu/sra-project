public com.capgemini.ms.orderservice.clients.Item getItemFromCache(long id) {
    if (((cacheManager.getCache("item")) != null) && ((cacheManager.getCache("item").get(id)) != null)) {
        return cacheManager.getCache("item").get(id, com.capgemini.ms.orderservice.clients.Item.class);
    }else {
        return null;
    }
}
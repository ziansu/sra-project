public boolean remove(long id) throws com.yarachkin.tetragon.tetragoncache.exception.CacheTetragonException {
    for (int i = 0; i < (cache.size()); i++) {
        if ((cache.get(i).getId()) == id) {
            cache.remove(id);
            return true;
        }
    }
    throw new com.yarachkin.tetragon.tetragoncache.exception.CacheTetragonException("Id wasn't found");
}
protected static void shiftMaps(java.util.Map<java.lang.Object, java.lang.Integer> idMap, java.util.Map<java.lang.Integer, java.lang.Object> indexMap, int lastDelete, int nextDelete, int deleteCount) {
    for (int i = lastDelete + 1; i < nextDelete; i++) {
        java.lang.Object id = indexMap.remove(i);
        indexMap.put((i - deleteCount), id);
        idMap.put(id, (i - deleteCount));
    }
}
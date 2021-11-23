protected void shiftMaps(int lastDelete, int nextDelete, int deleteCount) {
    for (int i = lastDelete + 1; i < nextDelete; i++) {
        java.lang.Object id = this.indexMap.remove(i);
        this.indexMap.put((i - deleteCount), id);
        this.idMap.put(id, (i - deleteCount));
    }
}
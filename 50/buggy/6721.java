public boolean storeFavorites() {
    this.favorite.storeXML(this.getInternalStorage());
    this.favorite.storeXML(this.getExternalStorage());
    return true;
}
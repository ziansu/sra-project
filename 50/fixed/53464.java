public boolean removeSubAlbum(Album toRemove) {
    assert toRemove != null;
    toRemove.setParent(null);
    return subAlbums.remove(toRemove);
}
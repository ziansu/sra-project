public boolean skipNext() {
    agersant.polaris.CollectionItem currentItem = player.getCurrentItem();
    return advance(currentItem, 1);
}
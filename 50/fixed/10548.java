public boolean skipPrevious() {
    agersant.polaris.CollectionItem currentItem = player.getCurrentItem();
    return advance(currentItem, (-1));
}
private void favoritesClicked(int position, com.thecodebuilders.adapter.ThumbnailListAdapter.ElementViewHolder thisViewHolder) {
    com.thecodebuilders.babysbrilliant.ListItem listItem = elements.get(position);
    if (listItem.isFavorite()) {
        mainActivity.removeFromFavorites(listItem.getRawJSON());
        setLookToNotFavorite(thisViewHolder);
    }else {
        listItem.isFavorite = true;
        mainActivity.addToFavorites(listItem.getRawJSON());
        setLookToFavorite(thisViewHolder);
    }
}
private void setItems(java.util.List<edu.galileo.android.twitterclient.entities.Image> newItems) {
    items.addAll(newItems);
    notifyDataSetChanged();
}
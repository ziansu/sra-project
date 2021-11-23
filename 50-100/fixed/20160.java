private void goToItemsAfterSearch(java.lang.String name, java.lang.String collectionId, java.lang.String userId) {
    android.content.Intent intent = new android.content.Intent(this, com.fangman.austin.thecollector.ItemsAfterSearchActivity.class);
    intent.putExtra("collectionName", name);
    intent.putExtra("collectionId", collectionId);
    intent.putExtra("userId", userId);
    startActivity(intent);
}
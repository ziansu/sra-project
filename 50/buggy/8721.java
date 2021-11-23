private void onStartAnimation(int itemId) {
    android.view.View item = mFixedItem.get(itemId);
    itemAutoMove(item, mPerTranslateY, 2.0F);
    preItemId = itemId;
}
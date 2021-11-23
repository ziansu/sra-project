private synchronized void up(int x, int y) {
    com.integreight.onesheeld.utils.customviews.MutitouchKeysContainer.PinData item = getTouhedIndex(x, y, childrenRects);
    if (((item.index) != (-1)) && (pressedRects.contains(item))) {
        item.key.eventListener.onReleased(item.key);
        pressedRects.remove(item);
    }
}
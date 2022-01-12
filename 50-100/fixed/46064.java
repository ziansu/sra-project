private synchronized void down(int x, int y) {
    com.integreight.onesheeld.utils.customviews.MutitouchKeysContainer.PinData item = getTouhedIndex(x, y, childrenRects);
    if (((item.index) != (-1)) && (!(pressedRects.contains(item)))) {
        pressedRects.add(item);
        if (((item.key) != null) && ((item.key.eventListener) != null))
            item.key.eventListener.onPressed(item.key);
        
    }
}
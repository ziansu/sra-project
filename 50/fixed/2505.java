private void recycle(figurabia.ui.video.engine.messages.CachedFrame cf, int times) {
    for (int i = 0; i < times; i++) {
        cf.recycle();
    }
}
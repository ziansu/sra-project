public void onDrawerClosed(android.view.View drawerView) {
    updateBufferRead();
    updateBufferRead();
    ((com.iskrembilen.quasseldroid.gui.fragments.BufferFragment) (manager.bufferFragment)).finishActionMode();
    setTitleAndMenu();
}
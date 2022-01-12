@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    final int stepSize = 100;
    if (com.spicymango.fanfictionreader.Settings.volumeButtonsScrollStory(this)) {
        if (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_DOWN)) {
            mListView.smoothScrollBy(stepSize, 100);
            return true;
        }
        if (keyCode == (android.view.KeyEvent.KEYCODE_VOLUME_UP)) {
            mListView.smoothScrollBy((-stepSize), 100);
            return true;
        }
    }
    return false;
}
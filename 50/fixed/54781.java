@java.lang.Override
public boolean deleteSurroundingText(int leftLength, int rightLength) {
    this.view.onKeyDown(KeyEvent.KEYCODE_DEL, this.delKeyDownEvent);
    this.view.onKeyUp(KeyEvent.KEYCODE_DEL, this.delKeyUpEvent);
    return super.deleteSurroundingText(leftLength, rightLength);
}
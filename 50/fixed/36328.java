@java.lang.Override
public void onCompletion(boolean inEarpieceMode) {
    audioCompleted(index);
    scrollPager.gotoFragment(((index + 1) % (nFragment)));
}
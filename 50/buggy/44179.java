@java.lang.Override
public void toNext() {
    android.net.Uri uri = getPlayInfoInner().nextOne(playRandomly());
    if (uri != null) {
        play(uri, 0);
    }else {
        stop();
    }
}
@java.lang.Override
public void play() {
    if ((_jni.isEnded()) == 0) {
        if ((_progressPlay.getVisibility()) == (android.view.View.VISIBLE)) {
            _progressPlay.setVisibility(View.GONE);
            _butPlay.setVisibility(View.VISIBLE);
        }else {
            _progressPlay.setVisibility(View.VISIBLE);
            _butPlay.setVisibility(View.GONE);
        }
    }
    super.play();
}
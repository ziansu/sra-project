@java.lang.Override
public void play() {
    if ((_jni.isEnded()) == 0) {
        if ((_progressPlay.getVisibility()) == (android.view.View.VISIBLE)) {
            _progressPlay.setVisibility(View.GONE);
            _butPlay.setVisibility(View.VISIBLE);
        }else {
            _butPlay.setVisibility(View.GONE);
            _progressPlay.setVisibility(View.VISIBLE);
        }
    }
    super.play();
}
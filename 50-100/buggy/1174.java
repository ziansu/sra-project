@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_DOWN)) {
        respeaker.pauseOriginal();
        respeaker.recordRespeaking();
    }
    if ((event.getAction()) == (android.view.MotionEvent.ACTION_UP)) {
        try {
            respeaker.pauseRespeaking();
            isCommented = true;
        } catch (org.lp20.aikuma.audio.record.Microphone.MicException e) {
            this.getActivity().finish();
        }
    }
    return false;
}
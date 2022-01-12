@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    switch (motionEvent.getAction()) {
        case android.view.MotionEvent.ACTION_DOWN :
            setLightColor(com.example.jensderond.simongame.ClassicActivity.RED, true);
            return true;
        case android.view.MotionEvent.ACTION_UP :
            setDarkColor(com.example.jensderond.simongame.ClassicActivity.RED);
            seq.sequenceHandler(com.example.jensderond.simongame.ClassicActivity.RED);
            return true;
    }
    return false;
}
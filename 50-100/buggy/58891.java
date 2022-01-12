@java.lang.Override
public void onButtonsClick(android.view.View view, android.view.MotionEvent event) {
    final int X = ((int) (event.getRawX()));
    if ((X <= 300) && (X > 200)) {
        mPlaying = !(mPlaying);
        cs446.mezzo.events.EventBus.post(new cs446.mezzo.events.control.PauseToggleEvent());
    }else
        if ((X <= 400) && (X > 300)) {
            cs446.mezzo.events.EventBus.post(new cs446.mezzo.events.control.PlayNextEvent());
        }
    
}
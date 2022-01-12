@java.lang.Override
public void onButtonsClick(android.view.View view, android.view.MotionEvent event) {
    final int X = ((int) (event.getRawX()));
    if (X <= 200) {
        mPlaying = !(mPlaying);
        cs446.mezzo.events.EventBus.post(new cs446.mezzo.events.control.PauseToggleEvent());
    }else
        cs446.mezzo.events.EventBus.post(new cs446.mezzo.events.control.PlayNextEvent());
    
}
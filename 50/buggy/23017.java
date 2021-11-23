@java.lang.Override
public void onAudioFocusChange(int focusChange) {
    com.xwhiteknuckle.soundfx.WidgetHelper.changeWidgetToPlay(this);
    stopSelf();
}
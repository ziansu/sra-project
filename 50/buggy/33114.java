@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    getSaveEffectValue(((seekBar.getProgress()) * (com.fesskiev.player.widgets.dialogs.effects.EffectDialog.SCALE)));
}
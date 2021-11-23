@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    com.ghy.yueplayer.common.PreferManager.setInt(PreferManager.BASS, seekBar.getProgress());
    if ((com.ghy.yueplayer.service.MusicPlayService.mBass) == null)
        return ;
    
    com.ghy.yueplayer.service.MusicPlayService.mBass.setStrength(((short) (seekBar.getProgress())));
    android.util.Log.i("musicFx", ("bass--onStopTrackingTouch-->>" + ((short) (seekBar.getProgress()))));
}
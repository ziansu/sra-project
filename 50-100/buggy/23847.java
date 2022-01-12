@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((com.ghy.yueplayer.service.MusicPlayService.mBass) == null)
        return ;
    
    com.ghy.yueplayer.service.MusicPlayService.mBass.setStrength(((short) (seekBar.getProgress())));
    com.ghy.yueplayer.common.PreferManager.setInt(PreferManager.BASS, seekBar.getProgress());
    android.util.Log.i("musicFx", ("bass--onStopTrackingTouch-->>" + ((short) (seekBar.getProgress()))));
}
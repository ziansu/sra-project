@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    if ((com.ghy.yueplayer.service.MusicPlayService.mEqualizer) == null)
        return ;
    
    com.ghy.yueplayer.service.MusicPlayService.mEqualizer.setBandLevel(brand, ((short) ((seekBar.getProgress()) + minEQLevel)));
    saveEQUALIZER(brand, ((seekBar.getProgress()) + minEQLevel));
    android.util.Log.i("musicFx", ((("brand--onStopTrackingTouch-->>" + brand) + "--level-->>") + ((short) ((seekBar.getProgress()) + minEQLevel))));
}
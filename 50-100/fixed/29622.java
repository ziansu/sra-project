@java.lang.Override
public void onStopTrackingTouch(android.widget.SeekBar seekBar) {
    saveEQUALIZER(brand, ((seekBar.getProgress()) + minEQLevel));
    if ((com.ghy.yueplayer.service.MusicPlayService.mEqualizer) == null)
        return ;
    
    com.ghy.yueplayer.service.MusicPlayService.mEqualizer.setBandLevel(brand, ((short) ((seekBar.getProgress()) + minEQLevel)));
    android.util.Log.i("musicFx", ((("brand--onStopTrackingTouch-->>" + brand) + "--level-->>") + ((short) ((seekBar.getProgress()) + minEQLevel))));
}
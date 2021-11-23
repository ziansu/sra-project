private void adjustWidth(int width) {
    while ((width - ((mWaveWidth) * (mWaveNumber))) < ((mWaveInterval) * ((mWaveNumber) - 1))) {
        if ((mWaveInterval) > (com.duan.library.BarWavesView.sMIN_WAVE_INTERVAL)) {
            (mWaveInterval)--;
        }else {
            if ((mWaveWidth) > (com.duan.library.BarWavesView.sMIN_WAVE_WIDTH)) {
                (mWaveWidth)--;
            }else {
                width++;
            }
        }
    } 
}
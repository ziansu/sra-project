private void adjustWidth(int width) {
    while (width < (((mWaveInterval) * ((mWaveNumber) - 1)) + ((mWaveWidth) * (mWaveNumber)))) {
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
public void run() {
    int streamId = soundPool.play(soundId, getFinalSoundVolume(), getFinalSoundVolume(), soundPriority, loop, rate);
    if (((loop) == (-1)) && (streamId != 0)) {
        loopingStreamList[loopingStreamIndex] = streamId;
        if ((loopingStreamCount) < (maxStreams)) {
            ++(loopingStreamCount);
            ++(loopingStreamIndex);
        }else {
            loopingStreamIndex = 0;
        }
    }
}
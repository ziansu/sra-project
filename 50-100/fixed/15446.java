public void run() {
    int streamId = soundPool.play(soundId, getFinalSoundVolume(), getFinalSoundVolume(), soundPriority, loop, rate);
    if (((loop) == (-1)) && (streamId != 0)) {
        loopingStreamList[loopingStreamIndex] = streamId;
        if ((loopingStreamCount) < (maxStreams)) {
            ++(loopingStreamCount);
        }
        if ((loopingStreamIndex) < (maxStreams)) {
            ++(loopingStreamIndex);
        }else {
            loopingStreamIndex = 0;
        }
    }
}
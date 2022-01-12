private void genericSetFreq(long freq, long bw) throws info.martinmarinov.drivers.DvbException {
    setTvStandard(bw);
    long loFreq = freq + (intFreq);
    setMux(loFreq);
    setPll(loFreq);
    if (!(hasLock))
        throw new info.martinmarinov.drivers.DvbException(info.martinmarinov.drivers.DvbException.ErrorCode.CANNOT_TUNE_TO_FREQ, resources.getString(R.string.cannot_tune, (freq / 1000000)));
    
    sysFreqSel(freq);
    int gain = readGain();
}
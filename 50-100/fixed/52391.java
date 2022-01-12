public InMind.Server.SignalInfoProvider.SignalInfo obtainSampleInfo(byte[] asByte, int length) {
    InMind.Server.SignalInfoProvider.SignalInfo signalInfo = new InMind.Server.SignalInfoProvider.SignalInfo();
    updateTalkAndSilent(asByte, length);
    signalInfo.finalPause = convertToMilliSeconds(bytesSilentAtEnd);
    signalInfo.vad = ((bytesTalkAtCurrentSample) > (minimalTalk)) ? 1 : 0;
    signalInfo.offSetFromFirst = totalTimeFromStart;
    signalInfo.sampleLength = (length * 1000.0) / (InMind.Consts.sampleRate);
    totalTimeFromStart += signalInfo.sampleLength;
    return signalInfo;
}
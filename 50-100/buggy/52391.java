public InMind.Server.SignalInfoProvider.SignalInfo obtainSampleInfo(byte[] asByte) {
    InMind.Server.SignalInfoProvider.SignalInfo signalInfo = new InMind.Server.SignalInfoProvider.SignalInfo();
    updateTalkAndSilent(asByte);
    signalInfo.finalPause = convertToMilliSeconds(bytesSilentAtEnd);
    signalInfo.vad = ((bytesTalkAtCurrentSample) > (minimalTalk)) ? 1 : 0;
    signalInfo.offSetFromFirst = totalTimeFromStart;
    signalInfo.sampleLength = ((asByte.length) * 1000.0) / (InMind.Consts.sampleRate);
    totalTimeFromStart += signalInfo.sampleLength;
    return signalInfo;
}
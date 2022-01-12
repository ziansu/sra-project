private void reset() {
    inSpeech = false;
    speechCount = 0;
    silenceCount = 0;
    startSpeechFrames = (startSpeechTime) / 10;
    endSilenceFrames = (endSilenceTime) / 10;
    speechLeaderFrames = (speechLeader) / 10;
    this.inputQueue = new java.util.LinkedList<edu.cmu.sphinx.frontend.endpoint.Data>();
    this.outputQueue = new java.util.LinkedList<edu.cmu.sphinx.frontend.endpoint.Data>();
}
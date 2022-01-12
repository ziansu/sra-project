public static TranscriptAlignment getTranscriptAlignment(java.net.URL audioUrl, java.lang.String transcript) throws java.lang.Exception {
    Context context = SpeechTools.getContext();
    context.setLocalProperty("trivialScorer->frontend", "unmarkedFrontEnd");
    return new TranscriptAlignment(transcript, SpeechTools.getWordAlignment(audioUrl, transcript), SpeechTools.getSpeechClassifiedData(audioUrl), SpeechTools.getFeatures(audioUrl));
}